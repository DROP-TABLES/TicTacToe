package game;

public class Board{
	private String[][] boxes;

	public Board(){
		boxes = new String[3][3];
		for(int i = 0; i < 3; i++){
			for(int y = 0; y < 3; y++){
				boxes[i][y] = " ";
			}
		}
	}

	public boolean CanPlaceMark(int x, int y){
		return boxes[x][y] == " ";
	}

	public boolean PlaceMark(String mark, int x, int y){
		if(CanPlaceMark(x, y)){
			boxes[x][y] = mark;
			return true;
		}else{
			return false;
		}
	}

	public String ToString(){
		String line = "-----\n";
		String value = boxes[0][0] + "|" + boxes[1][0] + "|" + boxes[2][0] +
				"\n" + line +
				boxes[0][1] + "|" + boxes[1][1] + "|" + boxes[2][1] +
				"\n" + line +
				boxes[0][2] + "|" + boxes[1][2] + "|" + boxes[2][2];
		return value;
	}

	public static void main(String args[]){
		Board b = new Board();
		System.out.println(b.ToString());
	}
	public boolean win()
	{
		for(int i = 0; i < 3; i++)
		{
			if(boxes[i][0] != " " && boxes[i][1] != " " && boxes[i][2] != " ")
			{
				if(boxes[i][0] == boxes[i][1] && boxes[i][0] == boxes[i][2])
				{
					return true;
				}
			}
			if(boxes[0][i] != " " && boxes[1][i] != " " && boxes[2][i] != " ")
			{
				if(boxes[0][i] == boxes[1][i] && boxes[0][i] == boxes[2][i])
				{
					return true;
				}
			}
		}
		if(boxes[0][0] != " " && boxes[1][1] != " " && boxes[2][2] != " ")
		{
			if(boxes[0][0] == boxes[1][1] && boxes[0][0] == boxes[2][2])
			{
				return true;
			}
		}
		if(boxes[2][0] != " " && boxes[1][1] != " " && boxes[0][2] != " ")
		{
			if(boxes[2][0] == boxes[1][1] && boxes[2][0] == boxes[0][2])
			{
				return true;
			}
		}
		return false;
	}
}
