#!/bin/bash
# setup_and_push.sh
# Run this script locally to compile, test, and push to GitHub
# Usage: chmod +x setup_and_push.sh && ./setup_and_push.sh

REPO_NAME="java-design-patterns"
GITHUB_USER="YOUR_GITHUB_USERNAME"   # <-- change this

echo "=============================="
echo " Java Design Patterns - Setup"
echo "=============================="

# 1. Verify Java is installed
if ! command -v javac &> /dev/null; then
    echo "ERROR: javac not found. Install JDK 8+ first."
    echo "  macOS : brew install openjdk"
    echo "  Ubuntu: sudo apt install default-jdk"
    exit 1
fi
echo "Java: $(javac -version 2>&1)"

# 2. Compile & run all exercises
echo ""
echo "--- Compiling all exercises ---"
PASS=0; FAIL=0
for dir in Ex*/src; do
    ex=$(dirname $dir)
    cd $dir
    if javac *.java 2>/dev/null; then
        echo "  ✓ $ex compiled"
        PASS=$((PASS+1))
    else
        echo "  ✗ $ex FAILED"
        FAIL=$((FAIL+1))
    fi
    cd - > /dev/null
done
echo "Compile results: $PASS passed, $FAIL failed"

# 3. Init git and push
echo ""
echo "--- Pushing to GitHub ---"
git init
git add .
git commit -m "Add all 11 Java Design Pattern exercises"
git branch -M main
git remote add origin https://github.com/$GITHUB_USER/$REPO_NAME.git
echo ""
echo "Next: Create the repo on GitHub, then run:"
echo "  git push -u origin main"
