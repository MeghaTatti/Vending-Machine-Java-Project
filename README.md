# Vending-Machine-Java-Project
This project is about the working of vending machine using Java Programming Language.

## How to run:
#### To run the executable .jar file,
• Open command prompt.

• Set the path to the place where the .jar file exists.

• Run with the command “java -jar VendingMachine.jar”

#### To compile the source code,
• Open the project in Java Eclipse and run.
Design Requirements:

**1. De-centralized State Pattern**

• Implemented in package "Model/EFSM" of the VendingMachine Module

• State classes are responsible for performing both actions and state transitions

• State class is the MDA-EFSM

• StateMachine is the abstract State superclass

• The subclasses are Start, NoCups, Idle, Coins_Inserted .

**2. Strategy Pattern**

• Implemented in package "Strategy_(StrategyName)" for the VendingMachine Module

• OutputProcessor is the client class that needs to be initialized with proper action strategies.

• There are 6 Strategy packages with 3 classes each

• One class is the abstract strategy that groups different implementations of a specific strategy.

• The other 2 classes are VendingMachine-1 and VendingMachine-2 specific implementation for the meta-actions of the model

**3. Abstract Factory Pattern**

• Implemented in package "AbstractFactory" of the VendingMachine Module

• AbstractFactory is the abstract superclass.

• ConcreteVending1 is the factory that returns the necessary driver objects for VendingMachine1

• ConcreteVending2 is the factory that returns the necessary driver objects for VendingMachine2

• The "VendingMachine" package contains the abstract class VendingMachine which uses the corresponding AbstractFactory

• Driver is initialized using VendingMachine1 and VendingMachine2 along with ConcreteVending1 and ConcreteVending2.
