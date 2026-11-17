#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>

int main()
{

   int A[] = {21, 19, 23, 15, 5};

   printf("Unsorted Array:    ");
   printArray(A, 5);

   printf("\n\n");

   printf("Sorting...\n");

   bubbleSort(A, 5);
   printf("\nSORTING SUCCESS!\n");
   printf("\n\nAfter bubble sort: ");
   printArray(A, 5);
   printf("\n\n");
}

void printArray(int A[], int size) {

    printf("{ ");

    for (int i = 0; i < size - 1; i ++) {

        printf("%d, ", A[i]);
    }

    printf(" %d}", A[size - 1]);
}

void bubbleSort(int A[], int n) {

    bool swapped;
    for (int i = 0; i < n - 1; i ++) {
        swapped = false;

        printf("\tBefore After Pass %d: ", i + 1);
        printArray(A, 5);

        for (int j = 0; j < n - i - 1; j ++) {
                printf("\n");

            if (A[j] > A[j + 1]) {

                // swapped function
                swap(A, j);
                printf("\t\t\t");
                printArray(A, 5); printf("\n");
                printf("\t\t\t");
                printNiceFormat(5, j);

                swapped = true;
            }


        }
        printf("\n");
        printf("\tArray After Pass %d: ", i + 1);
        printArray(A, 5);
        printf("\n");

        if (!swapped) {
            break;
        }

    }
}


void swap(int A[], int j) {

    A[j] = A[j] + A[j + 1];
    A[j + 1] = A[j] - A[j + 1];
    A[j] = A[j] - A[j + 1];

}

printNiceFormat(int size, int j) {

    for (int i = 0; i < size; i ++) {

        if (i == j) {

            printf("---");
        }

        else {
            printf("   ");
        }
    }
}
