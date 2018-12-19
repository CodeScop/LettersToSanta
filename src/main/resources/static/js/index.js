//function increment() {
//    document.getElementById('${recipe.getId()}').value = ++i;
//    console.log(i);
//}

let likeBtn = document.getElementById('likeBtn');
let i = 0;

likeBtn.addEventListener("click", function(e){
	this.nextElementSibling.value = ++i;
	console.log(i);
});