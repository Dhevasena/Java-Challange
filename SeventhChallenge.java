package javachallenge;
public class SeventhChallenge {
public boolean getDups()
{
    int[] nums= {1,2,3,1};
		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if(nums[i]==nums[j])
				{
					return true;
				}
			}
		}
		return false;
}

	public static void main(String[] args) {
	SeventhChallenge s =new SeventhChallenge();
	s.getDups();
	}

}

