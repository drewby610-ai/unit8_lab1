# Lab Reflection: Git Version Control + Debugging (BuggyProgram)

## Student Name
Drew Cupo

## GitHub Repository URL
https://github.com/drewby610-ai/unit8_lab1

---

# Commit 1: Initial Commit

## What did you include in this commit?
I included the initial Java project files, BuggyProgram.java, REAME.md, and the basic project structure needed to complete the lab.

## What was the purpose of this commit?
The purpose was to establish the starting point of the project in GitHun before making changes to the code and adding tests.

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
All three tests were failing: testEvenNumbers(), testNoEvenNumbers(), and testEmptyArray().

## What was the issue in the code?
The sum started at 1 instead of 0, and the loop used <= values.length, which made it access an index outside the array.

## What change did you make to fix it?
I changed the starting sum to 0 and removed the = from the loop condition.

## How did the tests help guide your fix?
The tests showed that the method crashed with different arrays, including an empty array. I reran the tests after my fixes and all 3 passed.

---

# Commit 4: Task 3 (sumRange)

## Which tests in Task3Test were failing before your fix?
The reverse-range test failed because it returned 0 instead of 15.
## What was the issue in the code?
The loop was adding 1 each time instead of the current number.

## What change did you make to fix it?
I added an if-else statement.

## How did the tests help guide your fix?
The tests verified that the method handled normal ranges, single numbers, and reversed ranges correctly after my changes.

---

# Overall Reflection

## Which task was the easiest to fix? Why?
Task 1 since I only needed to correct the conditions in the getGrade method to return appropriate values.

## Which task was the most difficult? Why?
Task 2 was the most difficult since it had two separate bugs.

## How did Git help you track your progress through the debugging process?
Git let me save progress after each task and keep a record of the changes i made.

## Why is it important to make small, frequent commits when debugging code?
Small commits make it easier to identify which changes cause any problems and it is easier to return to a working version.

## What did you learn about using JUnit tests to guide debugging?
Junit tests help to verify code produces the expected result. it also helps testing varius inputs and identify errors.

---

# Commit 5: Final Reflection

## What did you complete or update before making this final commit?

I completed the three debugging tasks, added JUnit tests for each method, verified all tests passed, and finished the README reflections.


## Why is it useful to document your work after completing a programming task?
Documentation helps explain what changes were made and why they were necessary. It also eases understanding and review later on.
