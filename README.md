
# RoboRace

This Java project contains multiple programs that simulate robots performing tasks like racing, moving objects, climbing mountains, and more.

## Table of Contents
- [Overview](#overview)
- [Setup](#setup)
- [Usage](#usage)
  - [RoboRace](#roborace)
  - [RobotMover](#robotmover)
  - [MountainClimber](#mountainclimber)
  - [Choose Your Own Adventure](#choose-your-own-adventure)
- [Requirements](#requirements)

## Overview

This project contains four different programs that simulate various robot tasks:
1. **RoboRace**: Two robots move alternately until they reach their destination at approximately the same time.
2. **RobotMover**: A robot moves a "Thing" from one position to another.
3. **MountainClimber**: A robot climbs a mountain, picks up a flag, and plants it at the top before descending.
4. **Choose Your Own Adventure**: You can explore custom robot behavior by creating your own scenarios.

## Setup

1. Make sure you have **Java 17** installed.
2. Clone this repository or download the source files.
3. Navigate to the project directory and compile the Java files using:

   ```bash
   javac RoboRace.java RobotMover.java MountainClimber.java RobotMoverApp.java Thing.java
   ```

## Usage

### RoboRace
Run the `RoboRace` program to simulate two robots racing to the destination:

```bash
java RoboRace
```

### RobotMover
Run the `RobotMoverApp` to move a "Thing" using a robot:

```bash
java RobotMoverApp
```

### MountainClimber
Run the `MountainClimberApp` to make a robot climb a mountain and plant a flag:

```bash
java MountainClimberApp
```

### Choose Your Own Adventure
You can create your own robot behaviors by extending the existing classes or writing new scenarios in a custom program.

## Requirements

- **Java 17 or higher**
- Basic understanding of Object-Oriented Programming (OOP) in Java.

---

Feel free to explore and modify the code to create new robot behaviors or scenarios!
