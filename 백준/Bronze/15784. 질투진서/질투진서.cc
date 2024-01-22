#include <iostream>

using namespace std;

int main()
{
    int N, row, col;
    cin >> N >> row >> col;
    bool isAngry = false;
    int num[1001][1001];

    row--, col--;
    // 입력
    for (int i = 0; i < N; i++)
    {
        for (int j = 0; j < N; j++)
        {
            cin >> num[i][j];
        }
    }
    // 가로
    int target = num[row][col];
    for (int i = 0; i < N; i++)
    {
        if (target < num[i][col])
        {
            cout << "ANGRY" << endl;
            return 0;
        }
    }
    // 세로
    if (isAngry == false)
    {
        for (int i = 0; i < N; i++)
        {
            if (target < num[row][i])
            {
                cout << "ANGRY" << endl;
                return 0;
            }
        }
    }
    cout << "HAPPY" << endl;
    return 0;
}