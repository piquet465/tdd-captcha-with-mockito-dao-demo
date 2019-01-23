package th.co.gosoft;

import org.junit.Test;

import java.util.Random;

import static org.junit.Assert.assertTrue;

public class RandomizerTest {

    class RandomSpy extends Random {
        int callNextIntTime = 0;
        int boundSpy;
        int DUMMY_RANDOM_RESULT = 0;

        public int nextInt(int boundSpy) {
            callNextIntTime++;
            this.boundSpy = boundSpy;
            return DUMMY_RANDOM_RESULT;
        }

        public boolean getPatternBehaviourVerified() {
            if (callNextIntTime == 1 && boundSpy == 2) return true;
            else return false;
        }

        public boolean getOperandBehaviourVerified() {
            if (callNextIntTime == 1 && boundSpy == 9) return true;
            else return false;
        }

        public boolean getOperatorBehaviourVerified() {
            if (callNextIntTime == 1 && boundSpy == 4) return true;
            else return false;
        }

        public boolean resultVerifiedByCheckPlus1(int result) {
            if (result == DUMMY_RANDOM_RESULT + 1) return true;
            else return false;
        }
    }

    @Test
    public void verifyGetPatternBehaviour() {
        RandomSpy Tanya = new RandomSpy();
        Randomizer randomizer = new Randomizer(Tanya);
        int result = randomizer.getPattern();
        assertTrue(Tanya.resultVerifiedByCheckPlus1(result));
        assertTrue(Tanya.getPatternBehaviourVerified());
    }

    @Test
    public void verifyGetOperandBehaviour() {
        RandomSpy Tanya = new RandomSpy();
        Randomizer randomizer = new Randomizer(Tanya);
        int result = randomizer.getOperand();
        assertTrue(Tanya.resultVerifiedByCheckPlus1(result));
        assertTrue(Tanya.getOperandBehaviourVerified());
    }

    @Test
    public void verifyGetOperatorBehaviour() {
        RandomSpy Tanya = new RandomSpy();
        Randomizer randomizer = new Randomizer(Tanya);
        int result = randomizer.getOperator();
        assertTrue(Tanya.resultVerifiedByCheckPlus1(result));
        assertTrue(Tanya.getOperatorBehaviourVerified());
    }
}
