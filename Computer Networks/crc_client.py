import socket
def client_program():
    host = "127.0.0.1"
    port = 5002
    client_socket = socket.socket() 
    client_socket.connect((host, port))
    data = client_socket.recv(1024).decode() 
    print('Received from server: ' + data)
    key=input("enter polynomial key in binary: ")
    crc(data,key)
    stringg="recived string without error"
    client_socket.send(stringg.encode())
    client_socket.close() 
def xor(a, b):
    result = []
    for i in range(1, len(b)):
        if a[i] == b[i]:
            result.append('0')
        else:
            result.append('1')

    return ''.join(result)

def mod2div(dividend, divisor):
    div= len(divisor)
    temp=dividend[0:div]
    zero_xor='0'*div
    while div<len(dividend):
        if temp[0]=='1':
            temp=xor(divisor,temp)+dividend[div]
        else:
            temp=xor(zero_xor,temp)+dividend[div]
        div+=1
    if temp[0]=='1':
        temp=xor(divisor,temp)
    else:
        temp=xor(zero_xor,temp)
        
    return temp
def crc(data,key):
    no_zero=len(key)-1
    crc_bits=mod2div(data,key)
    if ('0'*no_zero)==(crc_bits):
        print("remainder after decoding: ",crc_bits)
        print("No error has occurred")

client_program()
