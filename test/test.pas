Program Lesson1_Program3(hello);
{one line}
Var
    {
    multi line
    }
    Num1, Num2, Sum : Integer;

Begin {no semicolon}
    Write('Input number 1:');
    Readln(Num1);
    Writeln('Input number 2:');
    Readln(Num2);
    Sum := Num1 + Num2; {addition}
    Writeln(Sum);
    Readln;
End.