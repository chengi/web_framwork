package adapterPattern;

public class AudioPlayer implements MediaPlayer {

	MediaAdapter mediaAdaper;
	@Override
	public void play(String audioType, String fileName) {
		// TODO Auto-generated method stub

		if(audioType.equals("mp3")){
			System.out.println("playing a mp3 file. name"+fileName);
		}else if(audioType.equalsIgnoreCase("mp4")||audioType.equalsIgnoreCase("vlc")){
			mediaAdaper = new MediaAdapter(audioType);
			mediaAdaper.play(audioType, fileName);
			
		}else{
			System.out.println("Invalid media. " + audioType + " format not supported");
		}
			
	}

}
