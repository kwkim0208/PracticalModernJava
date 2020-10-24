package ch02;

public interface CompanyEncryption {
    public byte[] encrypt(byte[] bytes) throws Exception;
    public byte[] decrypt(byte[] bytes) throws Exception;
}
