#include <stdio.h>

int main()
{
    int n;
    scanf("%d", &n);
    int a[n][n], sum = 0;
    for (int i = 0; i < n; i++)
    {
        for (int j = 0; j < n; j++)
        {
            scanf("%d", &a[i][j]);
            if (i == j || i == n - j - 1 || i == n / 2 || j == n / 2)
            {
                sum += a[i][j];
            }
        }
    }
    printf("%d\n", sum);
    return 0;
}