-- =====================================================================
-- Exercise 1: Control Structures
-- =====================================================================
SET SERVEROUTPUT ON;

-- ---------------------------------------------------------------------
-- Scenario 1: Apply a 1% discount to loan interest rates for customers
--             above 60 years old.
-- ---------------------------------------------------------------------
BEGIN
    FOR rec IN (
        SELECT l.LoanID, l.InterestRate, c.Name,
               FLOOR(MONTHS_BETWEEN(SYSDATE, c.DOB) / 12) AS Age
        FROM Loans l
        JOIN Customers c ON c.CustomerID = l.CustomerID
    ) LOOP
        IF rec.Age > 60 THEN
            UPDATE Loans
               SET InterestRate = InterestRate - 1
             WHERE LoanID = rec.LoanID;
            DBMS_OUTPUT.PUT_LINE('Discount applied for ' || rec.Name ||
                                 ' (age ' || rec.Age || '). New rate = ' ||
                                 (rec.InterestRate - 1) || '%');
        END IF;
    END LOOP;
    COMMIT;
END;
/

-- ---------------------------------------------------------------------
-- Scenario 2: Promote customers with balance > $10,000 to VIP status.
-- ---------------------------------------------------------------------
BEGIN
    FOR rec IN (SELECT CustomerID, Name, Balance FROM Customers) LOOP
        IF rec.Balance > 10000 THEN
            UPDATE Customers
               SET IsVIP = 'Y'
             WHERE CustomerID = rec.CustomerID;
            DBMS_OUTPUT.PUT_LINE(rec.Name || ' promoted to VIP (balance ' || rec.Balance || ')');
        END IF;
    END LOOP;
    COMMIT;
END;
/

-- ---------------------------------------------------------------------
-- Scenario 3: Print a reminder for loans due within the next 30 days.
-- ---------------------------------------------------------------------
BEGIN
    FOR rec IN (
        SELECT c.Name, l.LoanID, l.EndDate
        FROM Loans l
        JOIN Customers c ON c.CustomerID = l.CustomerID
        WHERE l.EndDate BETWEEN SYSDATE AND SYSDATE + 30
    ) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Dear ' || rec.Name ||
                             ', your loan (ID ' || rec.LoanID ||
                             ') is due on ' || TO_CHAR(rec.EndDate, 'DD-MON-YYYY'));
    END LOOP;
END;
/
