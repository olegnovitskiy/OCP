package com.ocp.assessment;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Assessment7 {
    public static boolean setCurrentDirectory(String directory_name) {
        boolean result = false;  // Boolean indicating whether directory was set
        File    directory;       // Desired current working directory

        directory = new File(directory_name).getAbsoluteFile();
        if (directory.exists() || directory.mkdirs()) {
            result = (System.setProperty("user.dir", directory.getAbsolutePath()) != null);
        }

        return result;
    }

    public static void main(String[] args) throws IOException {
        boolean isChangedCurrentDirectory = setCurrentDirectory("bats/day");
        System.out.println(isChangedCurrentDirectory);

        Path path1 = Paths.get("/bats/night", "../")
                .resolve(Paths.get("./sleep.txt")).normalize();
        System.out.println(path1);

        Path path2 = new File("../sleep.txt").toPath().toRealPath(LinkOption.NOFOLLOW_LINKS);
        System.out.println(path2);

        System.out.print(Files.isSameFile(path1, path2)); // Get here exception!
        System.out.print(" " + path1.equals(path2));
    }
}
