#include <stdio.h>
#include <string.h>
int main()
{
    int size = 0, result = 0;
    char term[100];
    scanf("%d", &size);
    scanf("%s", term);

    for (int i = 0; i < strlen(term); i++)
    {
        result += term[i] - '0';
    }
    printf("%d", result);
    return 0;
}