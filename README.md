# Final-Project---Animal-Kingdom
ITWM5013 : Final Project - Animal Kingdom

This assignment will give you practice with defining classes. You are to write a set of classesthat define
the behavior of certain animals. You will be given a program that runs a simulation of a world with
many animals wandering around in it. Different kinds of animals will behave in different ways and you
are defining those differences.
For this assignment, you will be given a lot of supporting code that runs the simulation. While it is
running, the simulation will look something like this:

Download each of the following files (downloadable files will be made available in the course) and
make sure they are included in the same project/folder:
1. Critter.java
2. CritterInfo.java
3. CritterPanel.java
4. CritterModel.java
5. CritterMain.java
6. CritterFrame.java
7. Food.java
8. FlyTrap.java

Every object in this world is a "critter", where Critter is the super class with default behavior defined.
You will be writing five classes, each representing a different type of Animal: Bear, Tiger, WhiteTiger,
Giant and NinjaCat. All of the classes you right should be sub classes of Critter. On each round of the
simulation, each critter is asked for 3 pieces of information:
1. How should it act?
2. What color is it?
3. What string represents that critter?

These 3 pieces of information are provided by 3 methods present in each Critter class. You will be
responsible for overriding these methods and programming their appropriate behavior:

---------------------------------------------------------------------------------------------------------------------------------------------------------------

Below are some suggestions for how you can test your critters:

• Bear: Try running the simulator with just 30 bearsin the world. You should see about half of them
being white and about half being black. Initially they should all be displayed with slash characters.
When you click "step", they should allswitch to backslash characters. When you click "step" again
they should go back to slash characters and so on. When you click "start", you should observe the
bears heading towards walls and then hugging the walls in a counterclockwise direction. They will
sometimes bump into each other and go off in other directions, but their tendency should be to
follow along the walls.

• Tiger: Try running the simulator with just 30 Tigers in the world. You should see about one third
of them being red and one third being green and one third being blue. Use the "step" button to
make sure that the colors alternate properly. They should keep these initial colors for three
moves. That means that they should stay this color while the simulator is indicating that it is step
0, step 1, and step 2. They should switch colors when the simulator indicates that you are up to
step 3 and should stay with these new colors for steps 4 and 5. Then you should see a new color
scheme for steps 6, 7, and 8 and so on. When you click "start" you should see them bouncing off
of walls. When they bump into a wall, they should turn around and head back in the direction
they came. They will sometimes bump into each other as well. They shouldn’t end up clustering
together anywhere. WhiteTiger: This should behave just like a Tiger except that they will be
White. They will also be lower-case until they infect another Critter, then they "grow up".

• Giant: Try running the simulator with just 30 giants in the world. They should all be displayed as
"fee". This should be true for steps 0, 1, 2, 3, 4, and 5. When you get to step 6, they should all
switch to displaying "fie" and should stay that way forsteps 6, 7, 8, 9, 10, and 11. Then they should
be "foe" for steps 12, 13, 14, 15, 16, and 17. And they should be "fum" for steps 18, 19, 20, 21,
22, and 23. Then they should go back to "fee" for 6 more steps, and so on. When you click "start",
you should observe the same kind of wall-hugging behavior that bears have, but this time in a
clockwise direction
