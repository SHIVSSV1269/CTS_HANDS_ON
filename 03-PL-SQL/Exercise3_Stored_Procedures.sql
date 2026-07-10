-- =====================================================================
-- Exercise 3: Stored Procedures
-- =====================================================================
SET SERVEROUTPUT ON;

-- ---------------------------------------------------------------------
-- Scenario 1: ProcessMonthlyInterest
-- Apply 1% interest to the balance of all 'Savings' accounts.
-- ---------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest AS
BEGIN
    UPDATE Accounts
       SET Balance = Balance + (Balance * 0.01),
           LastModified = SYSDATE
     WHERE AccountType = 'Savings';
    DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT || ' savings account(s) credited 1% interest.');
    COMMIT;
END;
/

-- ---------------------------------------------------------------------
-- Scenario 2: UpdateEmployeeBonus
-- Add a bonus percentage to salaries of employees in a given department.
-- ---------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE UpdateEmployeeBonus (
    p_department    IN Employees.Department%TYPE,
    p_bonus_percent IN NUMBER
) AS
BEGIN
    UPDATE Employees
       SET Salary = Salary + (Salary * p_bonus_percent / 100)
     WHERE Department = p_department;

    IF SQL%ROWCOUNT = 0 THEN
        DBMS_OUTPUT.PUT_LINE('No employees found in department: ' || p_department);
    ELSE
        DBMS_OUTPUT.PUT_LINE(SQL%ROWCOUNT || ' employee(s) in ' || p_department ||
                             ' received a ' || p_bonus_percent || '% bonus.');
    END IF;
    COMMIT;
END;
/

-- ---------------------------------------------------------------------
-- Scenario 3: TransferFunds
-- Transfer an amount between two accounts, checking sufficient balance.
-- ---------------------------------------------------------------------
CREATE OR REPLACE PROCEDURE TransferFunds (
    p_from_account IN Accounts.AccountID%TYPE,
    p_to_account   IN Accounts.AccountID%TYPE,
    p_amount       IN NUMBER
) AS
    v_balance Accounts.Balance%TYPE;
BEGIN
    -- Lock the source row while we check and debit it.
    SELECT Balance INTO v_balance
      FROM Accounts
     WHERE AccountID = p_from_account
     FOR UPDATE;

    IF v_balance < p_amount THEN
        RAISE_APPLICATION_ERROR(-20001,
            'Insufficient balance in account ' || p_from_account);
    END IF;

    UPDATE Accounts
       SET Balance = Balance - p_amount, LastModified = SYSDATE
     WHERE AccountID = p_from_account;

    UPDATE Accounts
       SET Balance = Balance + p_amount, LastModified = SYSDATE
     WHERE AccountID = p_to_account;

    DBMS_OUTPUT.PUT_LINE('Transferred ' || p_amount || ' from account ' ||
                         p_from_account || ' to account ' || p_to_account);
    COMMIT;
EXCEPTION
    WHEN NO_DATA_FOUND THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Error: source account ' || p_from_account || ' not found.');
    WHEN OTHERS THEN
        ROLLBACK;
        DBMS_OUTPUT.PUT_LINE('Transfer failed: ' || SQLERRM);
END;
/

-- ---------------------------------------------------------------------
-- Example calls (uncomment to run after loading schema):
-- ---------------------------------------------------------------------
-- BEGIN ProcessMonthlyInterest; END;
-- /
-- BEGIN UpdateEmployeeBonus('IT', 10); END;
-- /
-- BEGIN TransferFunds(3, 2, 500); END;
-- /
