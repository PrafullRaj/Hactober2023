import socket
def sender():
    host = "127.0.0.1"
    port = 5002
    server_socket = socket.socket()
    server_socket.bind((host, port))
    server_socket.listen(2)
    conn, address = server_socket.accept()  
    print("Connection from: " + str(address))
    data=input("enter string you want to send in binary: ")
    key=input("enter polynomial key in binary: ")
    answer=crc(data,key)
    conn.send(answer.encode())
    print("you successfully sent: ",answer)
    data = conn.recv(1024).decode()
    print(data)
    conn.close()
def xor(a, b):
    
    result = []
    for i in range(1, len(b)):
        if a[i] == b[i]:    
            result.append('0')
        else:
            result.append('1')
    print(''.join(result))    
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
        print('dividend=',dividend[div])
        print('temp=',temp)
        div+=1
    if temp[0]=='1':
        temp=xor(divisor,temp)
    else:
        temp=xor(zero_xor,temp)
    return temp

def crc(data,key):
    no_zero=len(key)-1
    main_string=data+'0'*no_zero
    crc_bits=mod2div(main_string,key)
    crc_string=data+crc_bits
    print("crc bits sent: ",crc_bits)
    return crc_string

#sender()
crc('1001100','1001')


    
    


