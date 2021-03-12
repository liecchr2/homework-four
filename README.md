# homework-four
Repo for Homework 4, CS 2263

We are going to construct a simple social network application (nothing fancy, it just allows us to add new people and connect them). So the nodes are people, and the links between nodes are some type of relationship. For this application, we assert that every person is equal and thus there is only one type of person, you can add whatever attributes you deem appropriate (name, age, etc.). Next, are the types of relationships. Here I want you to consider the various ways in which people relate. With that in mind, I would expect this to form an inheritance hierarchy. Next, I would like to see you implement a visitor pattern which provides at least the following two types of basic operations:

1. Printing a relationship: which for any given relationship will output something similar to: Joe Smith -- married to -- Jane Smith

2. Summarizing the types of relationships. This visitor or visitors (depending on implementation) will count the number of relationships of a given type and once all relationships have been processed, will simply output the results in a simple table like format.

Relationship Type     Count
-----------------     -----
Married To                5
...
