var videos = [
    "https://www.w3schools.com/html/mov_bbb.mp4",
    "VII B",
    "VII C",
];

var judul = [
    "Kartun Lucu"
]

var category = [
    "David",
    "Anwar",
    "Ibnu Mundzir"
]


function tampil() {
    var video = document.getElementById("video-item");
    video.innerHTML = "<video controls><source></video><h3></h3><p></p>";
    for (let i = 0; i < kelas.length; i++) {
        var btnEdit = "<button class='btn btn-warning edit' href='#' onclick='edit(" + i + ")'>Edit</button>";
        var btnHapus = "<button class='btn btn-danger hapus' href='#' onclick='hapus(" + i + ")'>Hapus</button>";
        j = i + 1;
        video.innerHTML += "<video controls><source" + videos[i]+ "></video><h3>"+ +"</h3><p></p>";;
    }
}

function tambah(input) {
    var inputUrlVideo = prompt("Edit Kelas", video[input]);
    var inputJudul = prompt("Edit Nama", judul[id]);
    kelas.push(inputUrlVideo.value);
    nama.push(inputJudul.value);
    tampil();
    input.value = "";
}

function edit(id) {
    var kelasBaru = prompt("Edit Kelas", kelas[id]);
    var namaBaru = prompt("Edit Nama", nama[id]);
    kelas[id] = kelasBaru;
    nama[id] = namaBaru;
    tampil();
}

function hapus(id) {
    kelas.splice(id, 1);
    nama.splice(id, 1);
    tampil();
}

tampil();
