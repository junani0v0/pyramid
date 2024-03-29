주어진 문자열을 이용해 피라미드를 건설하고자 합니다.<br/>
<br/>
아래 메서드의 구현부를 완성하면 됩니다.<br/>
	

#### 아래 메서드는 피라미드를 옆에서 보았을때 모습을 출력하면 됩니다.
	public static String watchPyramidFromTheSide(String characters)

#### 아래 메서드는 피라미드를 위에서 내려보았을때의 모습을 출력하면 됩니다.
	public static String watchPyramidFromAbove(String characters)

#### 아래 메서드는 위에서 내려보았을때 보이는 블럭(문자)의 수를 계산하면 됩니다.
	public static int countVisibleCharactersOfThePyramid(String characters)

#### 아래 메서드는 피라미드가 완성되었을때 구성하고 있는 모든 블럭(문자)의 수를 계산하면 됩니다.
	public static int countAllCharactersOfThePyramid(String characters)
<br/>

주어진 문자열에서 각 문자는 피라미드의 한 층(floor)을 구성하게 됩니다.<br/>
따라서 주어진 문자열의 길이가 피라미드의 총 층수(floor)가 됩니다.<br/><br/>
각 층은 주어진 문자열에 맞게끔 지어져야 합니다.<br/>피라미드의 각 층은 정사각형으로 구성됩니다. 
	
	Example
	 - Given string: "abc"
	
	피라미드를 옆에서 보았을 때:
	  c
	 bbb
	aaaaa
	
	피라미드를 위에서 내려다 보았을 때:	
	aaaaa
	abbba
	abcba
	abbba
	aaaaa
	
	위에서 내려다 보았을때 보이는 블럭(문자)의 수 : 25
	피라미드를 구성하는 모든 블럭(문자)의 수 : 35
<br/>

주어진 문자열은 연속된 문자/숫자가 아니고 문자열의 길이 제한은 없습니다. 또한 공백일 수 없습니다.<br/><br/>
  [aaaaa(x) abcde(o), 11111(x) 12345(o)]
<br/><br/>
피라미드를 옆에서 보았을 때의 모습을 출력할 땐, 직 사각형안에 블럭(문자)가 출력되어야 합니다. 그러므로 줄 끝의 공백을 잘 생각해야 합니다.<br/>

만약 문자열이 null이거나 비어있다면 watch-메서드는 빈 문자열을 count-메서드는 -1을 반환합니다.