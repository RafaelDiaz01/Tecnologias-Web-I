document.addEventListener('DOMContentLoaded', function () {

    // Elementos del DOM
    const modalBackdrop = document.getElementById('modalBackdrop');
    const formModal = document.getElementById('formModal');
    const toggleFormBtn = document.getElementById('toggleFormBtn');
    const closeModalBtn = document.querySelector('.close-modal');
    const form = document.querySelector('#formModal form');

    // Función para abrir el modal en modo creación
    function openCreateForm() {
        // Resetear el formulario
        form.reset();
        // Cambiar el título del modal
        document.querySelector('.form-header h2').textContent = 'Registrar Nuevo Equipo';
        // Cambiar el texto del botón submit
        document.querySelector('.btn-submit').textContent = 'Registrar Equipo';
        // Resetear el campo hidden id
        document.querySelector('input[name="id"]').value = '';
        // Mostrar el modal
        showModal();
    }

    // Función para abrir el modal en modo edición
    function openEditForm(id, nombre, total, procedencia, capitan) {
        // Setear los valores del formulario
        document.querySelector('input[name="id"]').value = id;
        document.querySelector('input[name="nombre"]').value = nombre;
        document.querySelector('input[name="numJugadores"]').value = total;
        document.querySelector('input[name="procedencia"]').value = procedencia;
        document.querySelector('input[name="capitan"]').value = capitan;

        // Cambiar el título del modal
        document.querySelector('.form-header h2').textContent = 'Editar Equipo';
        // Cambiar el texto del botón submit
        document.querySelector('.btn-submit').textContent = 'Actualizar Equipo';
        // Mostrar el modal
        showModal();
    }

    // Función para mostrar el modal
    function showModal() {
        modalBackdrop.style.display = 'block';
        formModal.style.display = 'block';
        document.body.style.overflow = 'hidden'; // Prevenir scroll
    }

    // Función para ocultar el modal
    function hideModal() {
        modalBackdrop.style.display = 'none';
        formModal.style.display = 'none';
        document.body.style.overflow = 'auto'; // Restaurar scroll
    }

    // Event Listeners
    toggleFormBtn.addEventListener('click', openCreateForm);
    closeModalBtn.addEventListener('click', hideModal);
    modalBackdrop.addEventListener('click', hideModal);

    // Prevenir que el click en el modal lo cierre
    formModal.addEventListener('click', function (e) {
        e.stopPropagation();
    });

    // Hacer la función openEditForm global para que pueda ser llamada desde el HTML
    window.openEditForm = openEditForm;

    document.querySelectorAll('.delete-btn').forEach(btn => {
        btn.addEventListener('click', function () {
            const id = this.getAttribute('data-id');
            const nombre = this.getAttribute('data-nombre');
            console.log(id);

            if (confirm(`¿Estás seguro que deseas eliminar al equipo ${nombre} con id ${id}?`)) {
                window.location.href = `${pageContext}/equipos?action=delete&id=${id}`;
            }
        });
    });

    // Búsqueda de equipos
    const searchInput = document.getElementById('searchInput');
    searchInput.addEventListener('input', function () {
        const searchTerm = this.value.toLowerCase();
        const rows = document.querySelectorAll('.players-table tbody tr');

        rows.forEach(row => {
            const nombre = row.cells[0].textContent.toLowerCase();
            if (nombre.includes(searchTerm)) {
                row.style.display = '';
            } else {
                row.style.display = 'none';
            }
        });
    });
});