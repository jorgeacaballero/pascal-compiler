PROGRAM Sort(input, output);
        {
            Multi
            Line
        }

    BEGIN
        { Read }
        ReadArr(size, arr);

        { Sort using bubble sort. }
        FOR i := size - 1 DOWNTO 1 DO
            FOR j := 1 TO i DO
                IF arr[j] > arr[j + 1] THEN BEGIN
                    tmp := arr[j];
                    arr[j] := arr[j + 1];
                    arr[j + 1] := tmp;
                END;

        { Print. }
        FOR i := 1 TO size DO
            writeln(arr[i])
    END.