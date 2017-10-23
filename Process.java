
public class Process {
int A;
int B;
int C;
int M;

//the state of the process, 0 == unstarted, 1 == running, 2 == blocked, 3 == ready, 4 == terminated
int state = 0;

//how much time in this state is left?
int loopsLeft;

//process number
int processNum;

//if in state 3 (ready), how long has it been like that?
int readyNum = 0;

// how large was the last CPU burst (used for calculating the I/O burst time)
int CPUBurst;

//how many loops of CPU burst left until the process terminates
int CPULeft;

//what loop the Process finishes at
int finishTime;

//counts the total time spent blocked
int IOTime = 0;

//counts the total time spent ready
int waitTime = 0;

//counts the total time spent running (for HPRN)
int totRunningTime = 0;

//the penalty ratio (for HPRN)
double r = 0;

//the following attributes are for the round robin method
//counts the time spent in the current CPUBurst
int CPUBurstTime = 0;

//checks if the process was preempted
int preempted = 0;

public Process()
{
}

}

