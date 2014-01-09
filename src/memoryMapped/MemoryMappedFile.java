package memoryMapped;

import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Date;
import java.util.Timer;

public class MemoryMappedFile {
	
	private static int size = 10485760; // 10MB
	
	public static void main(String[] args) throws Exception{
		
		RandomAccessFile memoryMappedFile = new RandomAccessFile("memoryFile.txt", "rw");
		
		FileChannel.MapMode mode = FileChannel.MapMode.READ_WRITE;
		MappedByteBuffer out = memoryMappedFile.getChannel().map(mode, 0, size);
		
		Date start, end;
			start = new Date();
			// wiring into memory mapped file
			for(int i =0;  i<size ; i++){
				out. put((byte)'A');
			}
			end = new Date();
		long taken = end.getTime() - start.getTime();
		System.out.println("Writing to Memory Mapped File is completed in " + taken );
		
		//reading from memory file in Java
        for (int i = 0; i < 10 ; i++) {
            System.out.print((char) out.get(i));
        }

        System.out.println("Reading from Memory Mapped File is completed");


		
		
	}

}
