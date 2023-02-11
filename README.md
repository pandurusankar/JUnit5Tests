# JUnit5Tests

Basic Maven commands to run tests:
----------------------------------
1. mvn -Dgroups=regression test
2. mvn -Dgroups=smoke,regression test

Basic Git commands to setup environment:
----------------------------------------
1. git init
2. git config --global user.name "My Name"
3. git config --global user.email "myemail@example.com"
4. git config --global color.ui true

5. Unstage all the staged files
   git reset

6. Already committed a bunch of unwanted files, you can unstage them and tell git to mark them as deleted (without actually deleting them)
   git rm --cached -r .
   
5. git pull origin master --allow-unrelated-histories

Generate Allure report:
-----------------------
1. npm install -g allure-commandline --save-dev
2. allure generate allure-results --clean -o allure-report
3. copy 'history' folder from allure-report to allure-results folder (to display graphical trend) 
4. allure serve allure-results

5. pip install allure-combine
6. allure-combine allure-report