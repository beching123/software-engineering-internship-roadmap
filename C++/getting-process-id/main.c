#include <stdio.h>
#include <stdlib.h>
#include <sys/types.h>
#include <unistd.h>


int main() {
    int mypid;
    int myppid;

    printf("Program to know PID and PPID's information");

    mypid = getpid();
    myppid = getppid();

    printf("My process ID %d\n", mypid);
    printf("My parent process ID is %d\n", myppid);

    printf("Cross verification of pid's by executing process commands on shell\n");
    system("ps-ef");

    return 0;
}
