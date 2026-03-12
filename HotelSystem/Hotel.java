
public static String randomString(int i) {
    Random ran = new Random(i);
    StringBuilder sb = new StringBuilder();
    while (true) {
        int k = ran.nextInt(27);
        if (k == 0) break;
        sb.append((char) ('`' + k));
        //lalalala
        //sapo ijuepta escribele algo perro lo logramos...
        //laquesoporte
    }
    return sb.toString();
}

// Prints "hello world"
System.out.println(randomString(-229985452) + " " + randomString(-147909649));
