
class Solution {
    public int minMovesToSeat(int[] seats, int[] students) {
        Arrays.sort(seats);
        Arrays.sort(students);
        int diff = 0;
        int sum =0;
        int n = seats.length;

        for(int i=0;i<=n-1;i++){
           diff = Math.abs(seats[i]- students[i]);
           sum = sum + diff;
        }

      return sum;
    }

}
