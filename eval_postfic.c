#include <stdio.h>
#include <ctype.h>
#define MAX 30

float stack[MAX];
int top = -1;

void push(float stack[],float x);
float pop(float stack[]);
float evaluate(char exp[]);

int main()
{
    char exp[MAX];
    printf("\n Enter postfix exp: ");
    scanf("%s",exp);
    printf("\n The result is : ");
    printf("%0.02f",evaluate(exp));
}

void push(float stack[],float x)
{
    if(top == MAX-1)
    {
        printf("\n OVERFLOW");
    }
    else
    {
        stack[++top] = x;
    }
}

float pop(float stack[])
{
    if(top == -1)
    {
        return -1;
    }
    else
    {
        return stack[top--];
    }
}

float evaluate(char exp[])
{
    float op1,op2,value;
    int i=0;
    while(exp[i] != '\0')
    {
        if(isdigit(exp[i]))
        {
            push(stack,(float)(exp[i]-'0'));
        }
        else
        {
            op2 = pop(stack);
            op1 = pop(stack);
            switch(exp[i])
            {
                case '+': value = op1+op2;
                    break;
                case '-': value = op1-op2;
                    break;
                case '*': value = op1*op2;
                    break;
                case '/': value = op1/op2;
                    break;
                case '%': value = (int)op1%(int)op2;
                    break;
            }
            push(stack,value);
        }
        i++;
    }
    return(pop(stack));
}
