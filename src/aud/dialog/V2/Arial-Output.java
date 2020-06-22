package aud.dialog.V2;

class FOO {
static int[] a={1,2,3,4,5,6,7,8,9};
static int sum=0;
public static void main(String[] args) { 
bar();
}
public static void bar() { 
for (int i=0; i<a.length; i++) { 
sum=sum+a[i];
}
System.out.println(sum);
}
}
