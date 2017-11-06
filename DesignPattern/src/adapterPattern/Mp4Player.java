package adapterPattern;

public class Mp4Player implements AdvancedMediaPlayer {

	@Override
	public void playMp4(String fileName) {

		System.out.println("playing a mp4 file. name"+fileName);
	}

	@Override
	public void playVlc(String fileName) {
		// TODO Auto-generated method stub

	}

}
