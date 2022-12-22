public class _2037_Minimum_Number_of_Moves_to_Seat_Everyone {
    public int minMovesToSeat(int[] seats, int[] students) {
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats.length; j++) {
                int temp;
                if (seats[i] > seats[j]) {
                    temp = seats[i];
                    seats[i] = seats[j];
                    seats[j] = temp;
                }
            }
        }
        for (int i = 0; i < students.length; i++) {
            for (int j = 0; j < students.length; j++) {
                int temp;
                if (students[i] > students[j]) {
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

        int move = 0;
        for (int i = 0; i < seats.length; i++) {
            move += Math.abs(seats[i] - students[i]);
        }
        return move;
    }
}
