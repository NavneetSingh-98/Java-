package FunctionalAndProgramming.Challenges.Challenge110;

public class TestingFunctionlInterface {
    public static void main(String[] args) {
        Candidate candidate  = num -> {
            for(int i = 2 ; i< num; i++){
                if(num % i ==0){
                    return false;
                }

            }
            return true;

        };
    System.out.println( candidate.isCandidate(5));   
    }

}
