package ch8;

import static java.nio.file.StandardWatchEventKinds.ENTRY_CREATE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_DELETE;
import static java.nio.file.StandardWatchEventKinds.ENTRY_MODIFY;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;
import java.nio.file.WatchEvent.Kind;
import java.nio.file.WatchKey;
import java.nio.file.WatchService;

public class WatcheServicesMain {

	public static void main(String[] args) throws IOException, InterruptedException {

		Path dir = Paths.get(".");
		System.out.println(dir.toRealPath(LinkOption.NOFOLLOW_LINKS));


		WatchService watchService = FileSystems.getDefault().newWatchService();

		WatchKey watchKey = dir.register(watchService, ENTRY_CREATE, ENTRY_MODIFY, ENTRY_DELETE);

		while (true) {
			watchKey = watchService.take();
			for (WatchEvent<?> watchEvent : watchKey.pollEvents()) {
				Kind<?> kind = watchEvent.kind();
				Path path = ((WatchEvent<Path>) watchEvent).context();

				if (kind == ENTRY_CREATE)
					System.out.println(path + " Created");
				if (kind == ENTRY_MODIFY)
					System.out.println(path + " Modified");
				if (kind == ENTRY_DELETE)
					System.out.println(path + " Deleted");
			}
			if (!watchKey.reset()) {
				break;
			}
		}

		try {
			watchService.close();
		} catch (IOException e) {
			System.out.println(e);
		}

	}

}
