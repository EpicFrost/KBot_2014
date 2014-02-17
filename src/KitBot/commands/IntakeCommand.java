/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package KitBot.commands;

/**
 *
 * @author KBotics
 */
public class IntakeCommand extends CommandBase {
    public IntakeCommand() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis
        requires(CommandBase.Intake);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        CommandBase.Intake.stop();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        CommandBase.Intake.runIntake(CommandBase.oi.driver.getTrigger());
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        //CommandBase.Intake.stop();
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
        CommandBase.Intake.stop();
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
        CommandBase.Intake.stop();
    }
}