package com.banyuan.test10;

public interface ImageServer {
    void save();
}

class GIFSaver implements ImageServer {
    @Override
    public void save() {
        System.out.println("将图片保存成GIF格式");
    }

}

class JPEGSaver implements ImageServer {
    @Override
    public void save() {
        System.out.println("将图片保存成JPEG格式");
    }

}

class PNGSaver implements ImageServer {
    @Override
    public void save() {
        System.out.println("将图片保存成PNG格式");
    }

}


class TypeChooser {
    public static ImageServer getServer(String type) {
        if (type.equalsIgnoreCase("GIF")) {
            return new GIFSaver();
        } else if (type.equalsIgnoreCase("JPEG")) {

            return new JPEGSaver();
        } else if (type.equalsIgnoreCase("PNG")) {
            return new PNGSaver();
        }else {
            return null;
        }

    }

}

class User{
    public static void main(String[] args) {
        System.out.println("用户选择类GIF格式");
        ImageServer server=TypeChooser.getServer("GIF");
        server.save();
        System.out.println("用户选择类JPEG格式");
         server=TypeChooser.getServer("JPEG");
        server.save();
        System.out.println("用户选择类PNG格式");
        server=TypeChooser.getServer("PNG");
        server.save();

    }


}