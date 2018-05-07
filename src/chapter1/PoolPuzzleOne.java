package chapter1;

public class PoolPuzzleOne {
    public static void main(String[] args) {
        int x = 0;
        // x 가 어떤 수보다 클 때 while 을 순회한다면 x = 0 인 상황에서 아예 while 문이 돌지 않는다.
        // x 가 어떤 수보다 작을 때 while 을 순회한다는 조건에서 x < 1 은 while 문을 한 번밖에 순회하지 않으므로 최소 세문장을 출력해야 하는 조건상 맞지 않는다.
        while (x < 4) {
            // 모든 문장은 a와 n으로 시작한다 하지만 첫번째 문장에서 a와 n사이에 띄어쓰기가 있으므로 an은 사용할 수 없다.
            System.out.print("a");
            // a와 n사이의 띄어쓰기는 첫번째 문장에만 존재하므로 최초 한번 출력하도록 한다
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            //최초 문장의 나머지 문장인 oise 를 붙여 a noise 를 완성한다. x는 증가될 것이므로 x < 1 조건문에 다시 들어올 일은 없다.
            if (x < 1) {
                System.out.print("oise");
                // 여기서 x가 1 증가하게 되면 아래의 if 문에 걸려 첫번째 문장 뒤에 noys 가 붙게 된다. 증검은 아래에서 시켜주기로 하고 일단 x - 1 을 해준다.
                x = x - 1;
            }
            // 최초 loof 에서 x 는 -1 일 것이므로 아래의 두 if문에 들어오지 않는다.
            // 두번째 loof 에서 x = -1 상태에서 +2 가 되어 x = 1 이 되었다. 위에서 an 은 이미 출력되었고 아래의 조건에 해당하여 두번째 문장인 annoys 를 출력한다.
            // x > 1 은 false 이므로 이 if 문에는 해당하지 않는다
            if (x == 1) {
                System.out.print("noys");
            }
            // 세번째 loof 때 x = 1 인 상태에서 x + 2 가 되어 x = 3 이므로 마지막 조건에 부합하여 an ouster 라는 문장이 마지막으로 출력되게 된다.
            if (x > 1) {
                System.out.print(" oyster");
            }
            // 첫번째 문장이 완성되었으므로 다음줄로 이동시킨다.
            // x = -1 이므로 두번째 문장조건인 x == 1 에 맞추려면 x 에 2를 더하여야 한다.
            System.out.println("");
            x = x + 2;
            
        }
    }
}
