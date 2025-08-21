// #include <stdio.h>
// #include <stdlib.h>

int main() {
    int x = 10;
    int y = 20;
    
    int *px = &x;
    int *py = &y;
    
    printf("\n x = %d \t y = %d \t px = %p \t *px = %d", x, y, px, *px);
    printf("\n y = %d \t y = %d \t py = %p \t *py = %d", x, y, py, *py);
}