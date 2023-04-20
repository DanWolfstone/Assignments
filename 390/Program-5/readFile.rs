//---------- Imports ----------//
use std::fs::File;
use std::path::Path;
use std::io::{ self, BufRead, BufReader };

fn main() {
	
    println!("Name of Input File?");
	let mut input = String::new();
    //Read input and assign to var,
    io::stdin().read_line(&mut input);
    let input = input.trim(); // rid of leading/trailing whitespace
    
    let file_name = File::open(Path::new(&input)).unwrap(); // Filename = input
    let file_Buffer = BufReader::new(&file_name); //Buffer to read the file
    let mut file: Vec<String> = file_Buffer //Parse file to an array 
                                                    .lines()
                                                    .collect::<Result<_, _>>()
                                                    .unwrap();

 println!("{:?}", file);

 file.sort_by(|a, z| a.to_lowercase().cmp(&z.to_lowercase()));

println!("Sorted File");
println!("");
 println!("{:?}", file);


}
