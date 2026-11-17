#include <stdio.h>
#include <stdlib.h>
#include <time.h>

int main()
{
    int sizes[] = {101, 1001, 10001, 100001, 1000001}; // contains different sizes which will be used for our arrays
    int numberOfSizes = 5;


    for (int i = 0; i < numberOfSizes; i ++) {

        int n = sizes[i]; // variable to hold the size of the array
        int* arr = (int*) malloc(n * sizeof(int)); // using malloc to dynamically create arrays at run time

        if (arr == NULL) {
            printf("Memory allocation failed!");
            return 1;
        }

        fillArray(arr, n); // calling function to fill the array

        int cases[4];// different test cases

        // different cases
        cases[0] = 1 * 2 ;
        cases[1] = (float) (n / 2) *2;
        cases[2] = n * 2 - 2;
        cases[3] = -7;

        printf("\n\nCarrying out linear Search for the array with size of: %d\n", n - 1);

        // doing the linear search in terms of cases found in the case array
        for (int t = 0; t < 4; t ++) {

            clock_t start = clock(); // getting the time before the execution of the code
            int result = linearSearch(arr, n, cases[t]); // calling the linearSearch function
            clock_t end = clock(); // getting time after the execution of the code


            // calculating the CPU execution time of the algorithm
            double qu_time = ((double)(end - start) / CLOCKS_PER_SEC) * 100000000;
            double exec_time = qu_time;

            // printing the results
            printf("\tCase %d: \n", t);
            printf("\t\tElement %d was %s: %d\n", cases[t], ((result > 0)? "found at position": "not found. Returned Value: "), result );
            printf("\t\tTime Taken: %f\n", exec_time);
            printf("\n\n");

        }

    }

}

// function to fill array
void fillArray(int* arr, int size) {

    for (int i = 0; i < size; i ++) arr[i] = i * 2;
}


// implementation of the linear search algorithm
int linearSearch(int* arr, int size, int target) {

    for (int i = 0; i < size; i ++) {
        if (arr[i] == target)
            return i;
    }

    return -1;
}
