lass Main
{
    static int f[] = new int[10];
    static void preComputer()
    {
        f[0] = f[1] = 1;
        for (int i = 2; i<10; ++i)
            f[i] = f[i-1] * i;
    }

    static boolean checkStrong(int num)
    {
        int sum = 0;

        // traverse individual digits of num
        int temp = num;

        while (temp > 0)
        {
            sum += f[temp % 10];
            temp = temp / 10;
        }
        return (sum == num);
    }

    public static void main (String[] args)
    {
        preComputer();
        int val = 145;

        if(checkStrong(val))
            System.out.println("Its a strong number");
        else
            System.out.println("Its not a strong number");
    }
