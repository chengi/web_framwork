package adapterPattern;

public class VlcPlayer implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String fileName) {
		// TODO Auto-generated method stub

	}

	@Override
	public void playVlc(String fileName) {
		
		System.out.println("playing a vlc file. name"+fileName);

	}

}
