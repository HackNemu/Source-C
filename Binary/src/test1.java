import java.awt.Container;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;

/*========================================================================
 *[タイトル(作成者)]
 *進数変換ツール制作（五嶋隆文)
 *
 *[日付]
 *2020/1/24～
 * 
 *[目的]
 *進数変換ツール作成を通じてJavaのプログラミングを身につける
 * 
 *[入力]
 *2進数　10進数　16進数　の数値 
 * 
 *[出力]
 *対応した進数に変換した値
 * 
 *==========================================================================*/



public class test1 extends JFrame{
	private Container c;//設置するコンテナ
	int button_num;		
	
	public test1(String title) {   //コンストラクタ
		
		setTitle(title);		   	//タイトル設定
		setBounds(100,100,400,400);	//サイズ設定
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //終了設定
		
		c=this.getContentPane();   //コンテンツパネル取得
		c.setLayout(null);
	}
	
	public void number_button() {
		
		JButton buttonArray[][]; 	//ボタンの配列
		buttonArray=new JButton[3][3];
		
		for(int num_col=0;num_col<3;num_col++) {
			for(int num_row=0;num_row<3;num_row++) {
				
				button_num=num_row*3+num_col+1;											   //ボタンの番号				
				buttonArray[num_col][num_row]=new JButton(Integer.toString(button_num));
				
				buttonArray[num_col][num_row].setBounds(num_col*45,num_row*45+100,45,45); //ボタンの大きさ、位置
				
				c.add(buttonArray[num_col][num_row]);								      //パネルにボタン追加
				
			}	
		}
		
	}
	
	public void bin_area() {
		int randomValue;			 //乱数
		
		JButton bin_button [];		 //ラベルの配列
		bin_button=new JButton[4];	 //ラベルのオブジェクト生成
		
		Random random = new Random(); //乱数インスタンス生成
		
		for(int num=0;num<4;num++) {
			randomValue = random.nextInt(100); //0～99の中でランダムに数を生成
			
			bin_button[num]=new JButton(Integer.toString(randomValue%2)); //ボタンの番号を作る
			
			bin_button[num].setBounds(60*num, 0, 60, 60);		  //ボタンの大きさ、位置
			c.add(bin_button[num]);						  		  //パネルにボタン追加
			
		}
		
		
		
	}
	
	public void anser_area() {
		
	}

	
	public static void main(String[] args) {
		 test1 frame=new test1("bin");
		 frame.bin_area();
		 frame.number_button();
		 frame.setVisible(true);
		 
		 
	}
}