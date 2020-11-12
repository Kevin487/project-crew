# cs101f2020-project

## Table of Contents

- [Introduction](#introduction)
- [Continuous Learning](#continuous-learning)
- [Project Descriptions](#project-descriptions)
- [Project Requirements](#project-requirements)
- [Required Deliverables and Deadlines](#required-deliverables-and-deadlines)

- [System Commands](#system-commands)

- [Receiving Assistance](#receiving-assistance)

- [Project Assessment](#project-assessment)

Designed for use with [GitHub Classroom](https://classroom.github.com/), this repository contains the starter files for a final project in a Data Abstraction introductory computer science class. GatorGrader and GitHub Actions Continuous Integration are not used for this assignment.

You can choose to work individually or in a team for this project assignment. GitHub Classroom project assignment is set up to be an individual assignment. If you are working in a team, please have one team member accept the assignment and establish the repository. Then, contact the instructor or a technical leader to add the other team members to this repository.

## Introduction

Throughout the semester, you have explored the fundamentals of algorithm analysis, data structures, and Java programming by studying, in an applied fashion, topics such as variables and data types, the creation, use, and testing of Java classes, conditionals, loops, and recursion and various types of data containers such as linked lists. This final project invites you to explore, in greater detail, a real-world application of computer science. You will learn more about how to use, implement, test, and evaluate different types of real-world computer software.

Your project should result in a detailed report that includes all of your source code, in addition to written materials and technical diagrams that highlight the key contributions of your work. This technical report should include a description of why the chosen topic is important and discuss the implementation and/or experimentation that you undertook. The written material should be precise, formal, appropriately formatted, grammatically correct, informative, and interesting. The source code that you write must be carefully documented and tested. If you install and use existing computer software (e.g., a Java class for visualizing data structures), the steps for installation and use should be clearly documented in your report. Also, the report must explain the steps to run your own Java program. Finally, if you work in a team, your report must detail the work completed by each member of your team; individual contributions should also be reflected in commits to the team's repository. In addition to writing the aforementioned final report in Markdown, you will also use Markdown to write and submit a project proposal and a status update at the intermediate deadlines.

## Continuous Learning

To ensure that you are best prepared to complete this final project, please review all of the chapters that we have covered up to and after the release date of this assignment. As we cover new material during the remainder of the semester (e.g., trees and hash tables), you are also encouraged to review that content as it will better enable you to complete a high-quality final project.

If you have not done so already, please read all of the relevant [GitHub Guides](https://guides.github.com/) that explain how to use many of the features that GitHub provides. In particular, please make sure that you have read the following GitHub guides: [Mastering Markdown](https://guides.github.com/features/mastering-markdown/), [Hello World](https://guides.github.com/activities/hello-world/), and [Documenting Your Projects on GitHub](https://guides.github.com/features/wikis/). Each of these guides will help you to understand how to use both [GitHub](http://github.com) and [GitHub Classroom](https://classroom.github.com/).

Students who want to learn more about how to use [Docker](https://www.docker.com) should review the [Docker Documentation](https://docs.docker.com/). Students are also encouraged to review the documentation for their text editor, which is available for text editors like [Atom](https://atom.io/docs) and [VS Code](https://code.visualstudio.com/docs). You should also review the [Git documentation](https://git-scm.com/doc) to learn more about how to use the Git command-line client. In addition to talking with the instructor and technical leader for your course, students are encouraged to search [StackOverflow](https://stackoverflow.com/) for answers to their technical questions.

## Project Descriptions

Students are invited to pick one of the following projects. Please note that a student or a team selecting the student-designed project must first discuss the idea with the course instructor, and receive feedback and then final approval. Please note that you are fully responsible for ensuring the feasibility of the final project that is proposed.

1. **Cryptography and Cryptanalysis**: Explore a topic in the fields that make up the "art and science of sending and decoding secret messages". This project invites you to implement, test, and evaluate several cryptography and/or cryptanalysis systems. To start, you should investigate, implement, and test ciphers such as the Caesar and Vigenere ciphers. Then, you should use your ciphers to demonstrate that you can successfully send secret messages. In addition to creating and testing these Java programs, your report should include a detailed explanation of how your chosen algorithms work. Finally, you should conduct and carefully report on doubling experiments that evaluate the efficiency of your tool that performs cryptography and/or cryptanalysis. Along with studying content about any other necessary data structures or algorithms, students who pick this project should review the material about arrays andArrayLists in Chapters 3 and 7.

2. **Data Structures**: This topic invites you to either investigate a data structure that we did not already study this semester or, alternatively, further look into a data structure that we previously discussed. An individual or a team that selects this project might review the textbook's content about a specific data structure (e.g., Chapter 7's discussion of ArrayLists) and then identify one area for further study. For instance, you could decide to implement and test your own version of this data types that is "backed" by a fixed-size array. When you implement and test your own dynamic array that can both grow and shrink in size, you could use as an inspiration some of the guidelines in Chapter 7\. Finally, you can run experiments to assess the your implementation's efficiency and then write a performance evaluation report.

3. **Performance Evaluation**: Since it is often important to implement computer software that exhibits acceptable time and space overheads, this project invites students to use and/or extend performance evaluation software. After finding, reading, and understanding textbooks and research papers on this topic, students who pick this project should identify a focus area and create a benchmarking tool. The final version of the framework should allow students to measure the performance of computations in Java (perhaps through doubling experiments), report those measurements to the benchmark's user, and support informed decision making about design and implementation trade-offs. Along with including the source code of the benchmarks, this project invites students to write a performance evaluation report. Those picking this project should review Chapter 4's content about effective algorithm analysis.

4. **Searching and Sorting**: In a previous assignment you experimentally studied the performance of sorting algorithms. An individual or a team that selects this project could implement and then analytically and/or empirically study the performance of a sorting algorithm. Or, you could investigate an algorithm that searches through a data structure (e.g., a Tree or a hash table) and looks for data that matches a specific pattern. Students who pick this project should review Section 3.1.2 and further study Chapter 12 of the textbook. Next, this project invites you to conduct doubling experiments to assess the performance of your algorithms. Along with including the source code of the doubling experiment framework and your chosen algorithm, this project invites students to write a performance evaluation report.

5. **System Implementation**: Now that you understand the key topics of this course, you are ready to design, implement, and test your own Java program. An individual or a team that picks this project should first identify a problem domain in which they will work. For instance, you might decide that you want to implement your own command-line client for the Twitter social network by investigating the `Twitter4J` library. Then, you will need to decide on the data structures and algorithms that you will create to store and manipulate your data. Finally, you should conduct experiments to assess the efficiency of your implementation. If you choose this project, then you should review Chapter 2 and the chapter(s) for your chosen data structures. For instance, if you decide to store Twitter data in a list (e.g., a `SinglyLinkedList` or an `ArrayList`), then you should review the relevant details in Chapters 3 and 7.

6. **Student-Designed Project**: Students will develop an idea for their own project that focuses on one or more real-world topics in the field of computer science. After receiving the course instructor's approval for your idea, you will complete the project and report on your results.

## Project Requirements

Please note that the course instructor expects students to implement and evaluate all of the Java source code needed to complete their proposed project. As such, there are no provided Java source code files for this assignment except for two placeholder Java classes. You must implement your solution in multiple Java programs, utilizing the object-oriented nature of Java. This means, that you will need to add at least one or likely more Java classes, in addition to a Java class containing the main method. You will also need to edit the three Markdown files in the `writing/directory` by the stated deadline. Here are some additional tips to help you design, implement, and test the Java source code for the final project:

- Make sure that your Java source code contains declarations that place it in the correct package.

- Given the name that you picked for your package, ensure that your directories are correct.

- Update the `build.gradle` file so that it contains the correct package and Java class name.

- Update the `settings.gradle` file so that it also references the correct directory.

- Make sure that your `build.gradle` file is setup to support graphical and/or textual output.

- Remember that all of your Java source code must meet Google's styling standards.

- Recall that there are no GatorGrader code checks since each final project is different.

- In GatorGrader's absence, you should establish correctness checks for your source code.

- Importantly, you must implement `JUnit` tests to assess Java program correctness.

- Make sure to regularly commit to your GitHub repository.

## Required Deliverables and Deadlines

This assignment invites you to submit, using GitHub, the following deliverables.

1. Completed, fully commented, and properly formatted versions of all Java source code files. Please ensure that you source code adheres to all of the requirements mentioned in this assignment sheet (e.g., the use of Java constructs and the creation of a `JUnit` test suite).

2. A four-paragraph written proposal, saved in the file `writing/proposal.md`, with an informative title, a description of the main idea, an initial listing of the tasks that you must complete, and a plan that you will follow to complete the work.

3. A one-paragraph status update, saved in the file `writing/update.md`, that explains what you have already implemented and the steps that you will take to finish your program.

4. Participation in a Code Walkthrough. Code Walkthrough is a peer review of the code in which an author of the code leads the review process and the reviewers ask questions and spot possible errors. Technical leaders and the instructor will act as the reviewers. Each project's team members (or a single member) is considered to be an author of the code. For each written program, the author(s) will describe the written program by going through the code line by line and explaining the purpose of each line or a sequence of lines. The reviewers will provide feedback at the end of the review of each program or a complete review of Java classes, as appropriate. At the end of the walkthrough, the reviewers will report a list of findings and also identify high level action items, which will include the required next steps for the author(s) to take.

5. A detailed final project report, saved in the file `writing/report.md`, that documents, in a project-specific fashion, how you designed, implemented, and evaluated your system. This Markdown-based document should also explain and include the input, output, and the challenges that you confronted when implemented the project. For every challenge that you encountered, please explain your solution for it. If worked in a team, this document should also explain how your team collaborated to finish the assignment, with each team member writing their own paragraph inside of this Markdown file.

6. A commit log in your GitHub repository that clearly shows incremental progress made on the assignment.

You must complete all of the aforementioned deliverables by the following due dates:

1. **Project Proposal: Monday, November 16, 2020**: After brainstorming ideas during the lab session, pick a topic for your final project. Remember, if you select the student-designed project, you must first have your project approved by the course instructor. Next, make sure that you create a GitHub repository that can be accessed by the instructor. Finally, write and submit a one-page proposal for your project. Your proposal should have an informative title, a description of the main idea, an initial listing of the tasks that you must complete, and a plan for completing the work.

2. **Status Update: Monday, November 30, 2020**: As you continue working on your project, please write and submit a one paragraph status update through your Git repository.

3. **Code Walkthrough: Thursday, December 3, 2020**: You should give a demonstration, during the laboratory session, highlighting the most important code that you have finished. Code walkthrough is an informal process where code is reviewed for technical accuracy with the objective of finding errors and improving the quality of the code. The author(s) of the code lead the code walkthrough. The main purpose of walkthrough is to help authors gain an understanding of the content of the project and identify its potential flaws. Note that the goal of a walkthrough is an error detection (logical, compiler, run-time, output format, against development standards, etc.), not error correction. When the walkthrough is finished, the author of the output is responsible for taking the necessary actions to correct the errors.

4. **Final Project Due Date: Friday, December 11, 2020 by midnight**: You should submit the final version of your project through your project's GitHub repository. This submission should include all of the relevant source code and output, the written reports, and any additional materials that will demonstrate the success of your project. While you are encouraged to turn in the final project earlier, students must submit the completed assignment no later than 11:59 pm on the due date.

## System Commands

This assignment uses [Docker](https://www.docker.com), thereby eliminating the need for a programmer to install software on their development workstation. Please note that GatorGrader is not used in this assignment, thus `gradle grade` command is not accessible.

Once you have installed [Docker Desktop](https://www.docker.com/products/docker-desktop), you can use the following `docker run` command to enter an interactive terminal that will allow you to repeatedly run commands within the Docker container.

In Linux and Mac OS:

```bash
docker run -it --rm --name dockagator \
  -v "$(pwd)":/project \
  -v "$HOME/.dockagator":/root/.local/share \
  gatoreducator/dockagator /bin/bash
```

In Windows OS (replace `user` with your machine's username):

```bash
docker run -it --rm --name dockagator -v "%cd%":/project -v "C:\Users\user/.dockagator":/root/.local/share gatoreducator/dockagator /bin/bash
```

You can also complete several important Java programming tasks by using the `gradle` tool. Here are some commands that you can type:

- `gradle build`: compile the Java program
- `gradle run`: run the Java program in the command-line
- `gradle clean`: clean the project of all the derived files
- `gradle check`: check the quality of the code using Checkstyle
- `gradle build`: create the bytecode from the Java source code
- `gradle cleanTest`: clean the JUnit test suite of derived files
- `gradle test`: run the JUnit test suite and display the results
- `gradle tasks`: display details about the Gradle system

To run one of these commands, you must be in the main (i.e., "home base") directory for this assignment where the `build.gradle` file is located.

Here are some additional commands that you may need to run when using Docker:

- `docker info`: display information about how Docker runs on your workstation
- `docker images`: show the Docker images installed on your workstation
- `docker container list`: list the active images running on your workstation
- `docker system prune`: remove many types of "dangling" components from your workstation
- `docker image prune`: remove all "dangling" docker images from your workstation
- `docker container prune`: remove all stopped docker containers from your workstation
- `docker rmi $(docker images -q) --force`: remove all docker images from your workstation

## Receiving Assistance

If you are having trouble completing any part of this project, then please talk with either the course instructor or a student technical leader during the lab session. Alternatively, you may ask questions in the Slack workspace for this course. Finally, you can schedule a meeting during the course instructor's office hours.

## Project Assessment

The grade that a student receives on this assignment will have the following components:

- **Proposal [up to 10% of the project grade]**: Completed proposal document satisfying requirements of the proposal document specified above.

- **Status Update [up to 10% of the project grade]**: Completed status update document satisfying requirements of the status update document specified above.

- **Code Walkthrough [up to 15% of the project grade]**: Participation and

- **Final Implementation and Report [up to 65% of the lab grade]**: As a part of this grade, the instructor will assess aspects of the project including, but not limited to, the correct and useful Java source code and Markdown report, the use of effective source code comments and Git commit messages. Students are encouraged to ask the course instructor or a student technical leader to use the GitHub issue tracker to provide feedback on how well their work demonstrates mastery of the assignment's technical knowledge and skills.

All grades for the assignments in this course will be reported through Canvas. Feedback on lab assignments will be provided through a student's GitHub repository using the comment in the "Feedback" pull request.
