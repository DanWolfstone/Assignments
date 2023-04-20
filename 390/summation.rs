fn main() {
	println!("{}", sum_iterative(10));
	println!("{}", sum_recursive(10));
}

// Take variable N
fn sum_iterative(n: i32) -> i32 {
    let mut result = 0; 	// Mutable result function 
    for i in 1..=n { 			 // Iterate from 1 to N
        result += i;			 // add itself to result
    }
    result							// return result
}
fn sum_recursive(n: i32) -> i32 {
    if n == 0 {					// You can't recursively add 0 very well
        0
    } else {
        n + sum_recursive(n - 1)	// n + n -1
    }
}
