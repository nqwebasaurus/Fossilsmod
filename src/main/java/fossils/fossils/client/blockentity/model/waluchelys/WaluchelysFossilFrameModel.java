package fossils.fossils.client.blockentity.model.waluchelys;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class WaluchelysFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart Waluchelys;
	private final ModelPart frontleftleg4;
	private final ModelPart frontleftleg5;
	private final ModelPart frontleftleg6;
	private final ModelPart frontrightleg4;
	private final ModelPart frontrightleg5;
	private final ModelPart frontrightleg6;
	private final ModelPart chest;
	private final ModelPart frontleftleg;
	private final ModelPart frontleftleg2;
	private final ModelPart frontleftleg3;
	private final ModelPart frontrightleg;
	private final ModelPart frontrightleg2;
	private final ModelPart frontrightleg3;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart head;
	private final ModelPart leftFace;
	private final ModelPart rightFace;
	private final ModelPart lowerjaw;
	private final ModelPart tail;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tail6;
	private final ModelPart leftCarapace;
	private final ModelPart rightCarapace;

	public WaluchelysFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.Waluchelys = this.fossil.getChild("Waluchelys");
		this.frontleftleg4 = this.Waluchelys.getChild("frontleftleg4");
		this.frontleftleg5 = this.frontleftleg4.getChild("frontleftleg5");
		this.frontleftleg6 = this.frontleftleg5.getChild("frontleftleg6");
		this.frontrightleg4 = this.Waluchelys.getChild("frontrightleg4");
		this.frontrightleg5 = this.frontrightleg4.getChild("frontrightleg5");
		this.frontrightleg6 = this.frontrightleg5.getChild("frontrightleg6");
		this.chest = this.Waluchelys.getChild("chest");
		this.frontleftleg = this.chest.getChild("frontleftleg");
		this.frontleftleg2 = this.frontleftleg.getChild("frontleftleg2");
		this.frontleftleg3 = this.frontleftleg2.getChild("frontleftleg3");
		this.frontrightleg = this.chest.getChild("frontrightleg");
		this.frontrightleg2 = this.frontrightleg.getChild("frontrightleg2");
		this.frontrightleg3 = this.frontrightleg2.getChild("frontrightleg3");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.head = this.neck2.getChild("head");
		this.leftFace = this.head.getChild("leftFace");
		this.rightFace = this.head.getChild("rightFace");
		this.lowerjaw = this.head.getChild("lowerjaw");
		this.tail = this.Waluchelys.getChild("tail");
		this.tail2 = this.tail.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tail6 = this.tail5.getChild("tail6");
		this.leftCarapace = this.Waluchelys.getChild("leftCarapace");
		this.rightCarapace = this.Waluchelys.getChild("rightCarapace");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create().texOffs(2, 1).addBox(-0.5F, -7.0F, 6.5F, 1.0F, 7.0F, 1.0F, new CubeDeformation(-0.16F))
				.texOffs(2, 1).addBox(-0.5F, -8.0F, -6.4F, 1.0F, 8.0F, 1.0F, new CubeDeformation(-0.16F)), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition cube_r1 = fossil.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(2, 1).addBox(-3.3F, -2.5F, -0.5F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(2, 1).addBox(-3.3F, -2.5F, 12.4F, 1.0F, 5.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -7.5F, -5.9F, 0.0F, 0.0F, -1.5708F));

		PartDefinition Waluchelys = fossil.addOrReplaceChild("Waluchelys", CubeListBuilder.create(), PartPose.offset(0.5F, -3.5F, 0.0F));

		PartDefinition cube_r2 = Waluchelys.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(9, 53).addBox(-0.5F, 0.75F, 0.2F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -4.7432F, 6.2069F, -0.3752F, 0.0F, 0.0F));

		PartDefinition cube_r3 = Waluchelys.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(45, 3).addBox(-0.5F, 0.8F, 3.3F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F))
				.texOffs(42, 0).addBox(-0.5F, 0.8F, -0.4F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -5.3689F, 2.2562F, -0.1571F, 0.0F, 0.0F));

		PartDefinition cube_r4 = Waluchelys.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(19, 11).addBox(-0.5F, -0.7F, -13.5F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -3.65F, 8.5F, -0.0349F, 0.0F, 0.0F));

		PartDefinition frontleftleg4 = Waluchelys.addOrReplaceChild("frontleftleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(1.5269F, -1.5351F, 6.5961F, -0.1393F, 0.5593F, -0.4058F));

		PartDefinition frontleftleg5 = frontleftleg4.addOrReplaceChild("frontleftleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(2.894F, 3.2572F, -0.554F, -0.3846F, -0.9308F, 0.2124F));

		PartDefinition frontleftleg6 = frontleftleg5.addOrReplaceChild("frontleftleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6987F, 2.5754F, -0.5679F, 0.4947F, 0.451F, 0.4044F));

		PartDefinition frontrightleg4 = Waluchelys.addOrReplaceChild("frontrightleg4", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.5269F, -1.5351F, 6.5961F, 1.0965F, 0.6496F, 0.7623F));

		PartDefinition frontrightleg5 = frontrightleg4.addOrReplaceChild("frontrightleg5", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.894F, 3.2572F, -0.554F, 0.2424F, -0.0892F, -0.1185F));

		PartDefinition frontrightleg6 = frontrightleg5.addOrReplaceChild("frontrightleg6", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6987F, 2.5754F, -0.5679F, -0.3278F, -0.5374F, 0.0299F));

		PartDefinition chest = Waluchelys.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offset(-0.5F, -5.1016F, -4.5428F));

		PartDefinition cube_r5 = chest.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 46).addBox(-0.5F, 0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, -1.5F, 0.384F, 0.0F, 0.0F));

		PartDefinition frontleftleg = chest.addOrReplaceChild("frontleftleg", CubeListBuilder.create(), PartPose.offsetAndRotation(2.0269F, 3.5665F, -0.8612F, -0.4258F, 0.3593F, -0.3808F));

		PartDefinition frontleftleg2 = frontleftleg.addOrReplaceChild("frontleftleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(2.9853F, 3.2963F, -0.5424F, -0.0559F, -0.551F, 0.3102F));

		PartDefinition frontleftleg3 = frontleftleg2.addOrReplaceChild("frontleftleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.6987F, 2.5754F, -0.568F, 0.395F, 0.5138F, 0.1052F));

		PartDefinition frontrightleg = chest.addOrReplaceChild("frontrightleg", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.0269F, 3.5665F, -0.8612F, 0.1658F, 0.2784F, 0.416F));

		PartDefinition frontrightleg2 = frontrightleg.addOrReplaceChild("frontrightleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.9853F, 3.2963F, -0.5424F, 0.2059F, 0.551F, -0.3102F));

		PartDefinition frontrightleg3 = frontrightleg2.addOrReplaceChild("frontrightleg3", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.6987F, 2.5754F, -0.568F, -0.2199F, -0.5455F, -0.011F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.5F, 1.4509F, -3.506F, -0.4058F, 0.2145F, -0.0404F));

		PartDefinition cube_r6 = neck.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(67, 67).addBox(-1.0F, 1.0F, 1.4F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2F, -3.45F, 0.288F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.51F, -1.7503F, 0.2962F, 0.335F, 0.1F));

		PartDefinition cube_r7 = neck2.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(27, 47).addBox(-1.0F, 0.4F, -0.8F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.4F, -2.0F, -0.1047F, 0.0F, 0.0F));

		PartDefinition head = neck2.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.5F, -0.5727F, -2.2565F, -0.1289F, 0.0227F, 0.1731F));

		PartDefinition leftFace = head.addOrReplaceChild("leftFace", CubeListBuilder.create(), PartPose.offset(1.575F, -1.4452F, -1.1178F));

		PartDefinition rightFace = head.addOrReplaceChild("rightFace", CubeListBuilder.create(), PartPose.offset(-1.575F, -1.4452F, -1.1178F));

		PartDefinition lowerjaw = head.addOrReplaceChild("lowerjaw", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3085F, -0.167F, 0.7418F, 0.0F, 0.0F));

		PartDefinition tail = Waluchelys.addOrReplaceChild("tail", CubeListBuilder.create().texOffs(68, 54).addBox(-0.5F, -0.05F, -0.05F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(-0.5F, -2.9206F, 8.6031F, -0.3659F, 0.1941F, 0.018F));

		PartDefinition tail2 = tail.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(37, 46).addBox(-0.5F, 0.0375F, -0.369F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F))
				.texOffs(40, 49).addBox(-0.5F, 0.0375F, 3.3309F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.065F, 2.0122F, -0.0791F, 0.1305F, -0.0103F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.0317F, 3.8526F, -0.0195F, 0.1309F, -0.0026F));

		PartDefinition cube_r8 = tail3.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(22, 52).addBox(-0.5F, -0.2F, -0.1F, 1.0F, 1.0F, 3.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.3F, 0.15F, 0.1047F, 0.0F, 0.0F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(0, 68).addBox(-0.5F, 0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F))
				.texOffs(1, 69).addBox(-0.5F, 0.5F, 1.5F, 1.0F, 1.0F, 1.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.6799F, 2.8384F, 0.028F, 0.1255F, 0.0373F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(21, 68).addBox(-0.5F, 0.5F, 0.1F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0313F, 1.8341F, 0.0611F, 0.1307F, 0.008F));

		PartDefinition tail6 = tail5.addOrReplaceChild("tail6", CubeListBuilder.create().texOffs(71, 25).addBox(-0.5F, 0.5F, -0.2F, 1.0F, 1.0F, 2.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.0197F, 1.9602F, -0.0682F, 0.2613F, 0.0162F));

		PartDefinition leftCarapace = Waluchelys.addOrReplaceChild("leftCarapace", CubeListBuilder.create(), PartPose.offset(1.0F, 0.5F, 0.25F));

		PartDefinition rightCarapace = Waluchelys.addOrReplaceChild("rightCarapace", CubeListBuilder.create(), PartPose.offset(-2.0F, 0.5F, 0.25F));

		return LayerDefinition.create(meshdefinition, 90, 90);
	}

	@Override
	public void setupAnim(float p_170950_, float p_170951_, float p_170952_) {		
		this.fossil.yRot = p_170951_ * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		fossil.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}