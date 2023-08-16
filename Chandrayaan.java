public class Chandrayaan {

    public String processCharArray(char[] charArray) {
        StringBuilder result = new StringBuilder();
        int x, y , z=0;
        char Direction;
        for (char ch : charArray) {
            if (ch == 'f') {
                y++;
                Direction='N';
                return (x,y,z,Direction);
            }
            if (ch=='r'){
                Direction='E';
                return (x,y,z,Direction);
            }
            if(ch=='u'){
                Direction='U';
                return (x,y,z,Direction);
            }
            if(ch='b'){
                if(Direction='d'){
                    z--;
                    return (x,y,z,Direction);
                }

                else if (Direction='u'){
                    z++;
                    return (x,y,z,Direction);
                }
                }
            if(ch='l'){
                Direction='W';
                return (x,y,z,Direction);
            }
            }
        return result.toString().trim();
    }
}
