public class Chandrayaan {

    public String processCharArray(char[] charArray) {
        StringBuilder result = new StringBuilder();
        int i, x, y , z=0;
        String[] Direction = new String[4];
        String[] Direction = {"N", "E", "S" ,"W"};
        char D;
        for (char ch : charArray) {
            if (ch == 'f') {
                y++;
                D=Direction[i];
                return (x,y,z,D);
            }
            if(ch=='b'){
                if(D='u'){
                    z--;
                    return (x,y,z,D);
                }

                else if (D=='d'){
                    z++;
                    return (x,y,z,D);
                }
                else{
                    y--;
                    D=Direction[i+2];
                    return (x,y,z,D);
                }
            if (ch=='r'){
                D=Direction[i++];
                return (x,y,z,D);
            }
            if(ch=='l'){
            D=Direction[i--];
            return (x,y,z,Direction);
            }
            if(ch=='u'){
                D='U';
                return (x,y,z,D);
            }
            if(ch=='d'){
                D='D';
                return (x,y,z,D);
            }
        return result.toString().trim();
    }
}
