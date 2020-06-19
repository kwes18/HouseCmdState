# HouseCmdState
a java program that combines the command and state design patterns. 
Three devices are controlled with a remote. The blinds have two buttons- up and down; the light and music each have one button.
The blind opens when up is pressed on the remote. If down is pressed while the blind is opening it will pause (same thing occurs if up is pressed while the blind is closing).
The light goes through a sequence of low->fully on->off when its button is pressed.
The music has only two states -playing and paused.
Maintaining the device's current state eliminates the need for multiple else-if statements.
The command pattern decouples the devices from the remote. New devices can be assigned easily. 
