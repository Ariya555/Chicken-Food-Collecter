# #**🐔 Chicken Food Collector**

A simple 2D arcade-style collection game developed in Java Swing as a university project. The player controls a chicken character, navigates around a fixed screen area to collect randomly spawning corn cobs, increases their score, and aims to achieve a winning condition.


##**🎮Features**

1.Player Movement: Full 2D navigation using the keyboard arrow keys.

2.Dynamic Sprite Flipping: Automatic tracking of horizontal direction, flipping the chicken character to face left or right based on movement inputs.

3.Procedural Spawning: Random target item positioning fully managed within the frame's structural boundaries.

4.Beak-to-Target Collision: Precise bounding box intersect evaluation focused around the coordinates of the chicken's beak and the corn cob asset.

5.On-Screen Dashboard: Clean visual overlay showing live text strings tracking the player's progression score.

6.Win Condition Mechanism: Event listener that flags a completion state immediately upon satisfying requirements.

7.Instant Session Reset: One-touch baseline restoration mechanism to wipe and re-initialize scores and positions.

##**🛠 Technologies**

-Java Core

-Java Swing

-Java AWT & Graphics2D

-Random Geometry Coordinates


##**💻 Requirements**

1.JDK 17 or newer

2.Any Java Integrated Development Environment (IDE) like IntelliJ IDEA, NetBeans, or Eclipse


##**🚀 How to Run**

1.Clone the repository:

https://github.com/Ariya555/Chicken-Food-Collecter

2.Open the project inside your preferred Java IDE (such as NetBeans, VS Code, or IntelliJ).

3.Locate the file chickenfoodcollector.java.

4.Run the standard main() method to start the game.

5.Focus execution controls on the active window panel to begin playing.


 ##**🎮 Controls**

| Key | Action |
|-----|--------|
| ↑ | Move Chicken Up |
| ↓ | Move Chicken Down |
| ← | Move Chicken Left |
| → | Move Chicken Right |
| R | Restart Game |


##**📁 Project Structure**

src/

└── Chickenfoodcollector/

├── chickenfoodcollector.java (Contains main class, GameFrame, and GamePanel)

├── Chicken.java

└── Corn.java

##**Main Classes**

1.chickenfoodcollector.java: Acts as the system manager. Sets window frameworks (GameFrame) and executes rendering, text layouts, input mapping, and logic loops inside GamePanel.

2.Chicken.java: Dictates vector styling models, bounding limitations, orientation toggles, and drawing procedures for the player asset.

3.Corn.java: Manages structural shape coordinate calculations and drawing procedures for the objective item.


##**💥 Collision Detection**

Collision evaluation is evaluated custom-frame via pixel boundaries inside 

GamePanel.java. 

Rather than checking the entire character box, it narrows calculation down to coordinates matching the beak:

java

if (beakX < cornX + cornWidth &&

    beakX + beakWidth > cornX &&
    
    beakY < cornY + cornHeight &&
    
    beakY + beakHeight > cornY)
    

##**📅 Weekly Development**

-Week 1 — Project Planning & Research
Selected Chicken Food Collector Game idea.
Defined project objectives and understood game requirements.
Created a 10-week development timeline structure.

-Week 2 — Game Design & Flowchart
Designed game layout parameters.
Decided chicken and corn coordinate position scales.
Created the application logic flowchart and prepared foundational mechanics.

-Week 3 — Project Setup & GUI
Initialized the Java project repository structure.
Rendered the primary game frame container window.
Split classes into distinct project files and tested execution baselines.

-Week 4 — Chicken Character Development
Coded vector geometry elements creating the chicken's body, comb, and legs.
Anchored standard starting position offsets.
Tested scaling and asset display properties on screen.

-Week 5 — Chicken Movement
Integrated keyboard bindings using KeyListener interfaces.
Linked arrow input actions to translation formulas.
Added boundaries to stop the chicken from sliding out of bounds.

-Week 6 — Corn Generation
Coded individual husk leaf polygons and row-by-row kernel drawing loops.
Generated target tracking shapes onto the drawing context array.
Established relative initialization position defaults.

-Week 7 — Corn Collection & Score
Coded collision detection between the chicken's beak and the corn's boundaries.
Scripted score value trackers that increment after collection.
Programmed text rendering engines to print data blocks onto the layout.

-Week 8 — Random Corn Placement
Implemented random coordination formulas to spawn corn within boundary frameworks.
Configured logic patterns to loop and update values sequentially.
Cleaned game functionality routines.

-Week 9 — Winning Condition
Set fixed validation conditions to lock win triggers at 10 points.
Developed custom victory screen components displaying completion text.
Completed core logical loop mechanics.

-Week 10 — Testing & Documentation
Verified performance, constraints, and operational functions.
Cleaned minor software bugs and logic defects.
Captured gameplay screenshots and compiled presentation reports.


##**🏆 Game Rules**

-Target Goal: Collect 10 corn items to achieve victory.

-Score Progression: Each successful corn touch awards +1 point.

-Respawn Loop: Collecting an active corn item automatically moves it to a new random location.

-Win Trigger: Reaching 10 points stops gameplay loop tracking and displays the "YOU WIN!" message.

-Session Reset: Pressing R clears data values back to zero instantly.


##**🔮 Future Improvements**

-Graphical Upgrades: Integrating external asset image sheets (PNG) instead of manual geometry shapes.

-Audio Elements: Adding audio playback engines for movement cues, scoring pings, and completion tracks.

-Obstacle Entities: Deploying moving hazards that lower score counters or impede character travel paths.

-Progression Systems: Introducing multiple levels with varying collection speeds and point objectives.


-Menu Layers: Incorporating introductory front-ends and pause menu states.


##**👨‍💻 Project Information**

Project: Chicken Food Collector 

Language: JavaGUI 
Layout: Java Swing / AWT
Type: University Project
Status: Completed
