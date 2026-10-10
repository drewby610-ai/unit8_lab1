# Lab Reflection: Git Version Control + Debugging (BuggyProgram)

## Student Name
Drew Cupo

## GitHub Repository URL
https://github.com/drewby610-ai/unit8_lab1

---

# Commit 1: Initial Commit

## What did you include in this commit?
-

## What was the purpose of this commit?
-

---

# Commit 2: Task 1 (getGrade)

## Which tests in Task1Test were failing before your fix?
The testExceeds and testBoundary80 tests failed initially. After correcting those issues, testBoundary90 also failed until I fixed the condition.

## What was the issue in the code?
The return values for Executes and Meets were reversed, and the conditions did not include the boundary scores of 80 and 90 correctly.

## What change did you make to fix it?
I corrected the return values and changed the conditions to use >= inatead of > so the boundary scores were included.

## How did the tests help guide your fix?
The JUnit tests showed which results were incorrect. I used the failures to identify the problems and made the corrections then ran tests until all four passed.

---

# Commit 3: Task 2 (sumEvenNumbers)

## Which tests in Task2Test were failing before your fix?
-

## What was the issue in the code?
-

## What change did you make to fix it?
-

## How did the tests help guide your fix?
-

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
-

## What was the issue in the code?
-

## What change did you make to fix it?
-

## How did the tests help guide your fix?
-

---

# Overall Reflection

## Which task was the easiest to fix? Why?
-

## Which task was the most difficult? Why?
-

## How did Git help you track your progress through the debugging process?
-

## Why is it important to make small, frequent commits when debugging code?
-

## What did you learn about using JUnit tests to guide debugging?
-

---

# Commit 5: Final Reflection

## What did you complete or update before making this final commit?
-

## Why is it useful to document your work after completing a programming task?
-