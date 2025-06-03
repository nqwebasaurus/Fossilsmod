package fossils.fossils.client.blockentity.model.austriadactylus;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.minecraft.client.model.SkullModelBase;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;

@SuppressWarnings("unused")
public class AustriadactylusFossilFrameModel extends SkullModelBase {
	private final ModelPart fossil;
	private final ModelPart root;
	private final ModelPart body2;
	private final ModelPart hips;
	private final ModelPart tail1;
	private final ModelPart tail2;
	private final ModelPart tail3;
	private final ModelPart tail4;
	private final ModelPart tail5;
	private final ModelPart tailthing1;
	private final ModelPart upperleg1;
	private final ModelPart leg1;
	private final ModelPart feet1;
	private final ModelPart legwing12;
	private final ModelPart legwing11;
	private final ModelPart upperleg2;
	private final ModelPart leg2;
	private final ModelPart feet2;
	private final ModelPart legwing2;
	private final ModelPart legwing3;
	private final ModelPart chest;
	private final ModelPart upperwing1;
	private final ModelPart wing1;
	private final ModelPart wingfingerbase1;
	private final ModelPart wingfinger2;
	private final ModelPart hand1;
	private final ModelPart upperwing2;
	private final ModelPart wing2;
	private final ModelPart wingfingerbase2;
	private final ModelPart wingfinger3;
	private final ModelPart hand2;
	private final ModelPart neck;
	private final ModelPart neck2;
	private final ModelPart underneck1;
	private final ModelPart head1;
	private final ModelPart jaw1;
	private final ModelPart jaw2;
	private final ModelPart jaw3;
	private final ModelPart lowerteeth1;
	private final ModelPart underhead1;
	private final ModelPart lowerteeth2;
	private final ModelPart gums1;
	private final ModelPart head2;
	private final ModelPart head3;
	private final ModelPart head5;
	private final ModelPart crest2;
	private final ModelPart teeth1;
	private final ModelPart head4;
	private final ModelPart crest1;
	private final ModelPart teeth2;

	public AustriadactylusFossilFrameModel(ModelPart root) {
		this.fossil = root.getChild("fossil");
		this.root = this.fossil.getChild("root");
		this.body2 = this.root.getChild("body2");
		this.hips = this.body2.getChild("hips");
		this.tail1 = this.hips.getChild("tail1");
		this.tail2 = this.tail1.getChild("tail2");
		this.tail3 = this.tail2.getChild("tail3");
		this.tail4 = this.tail3.getChild("tail4");
		this.tail5 = this.tail4.getChild("tail5");
		this.tailthing1 = this.tail5.getChild("tailthing1");
		this.upperleg1 = this.hips.getChild("upperleg1");
		this.leg1 = this.upperleg1.getChild("leg1");
		this.feet1 = this.leg1.getChild("feet1");
		this.legwing12 = this.leg1.getChild("legwing12");
		this.legwing11 = this.upperleg1.getChild("legwing11");
		this.upperleg2 = this.hips.getChild("upperleg2");
		this.leg2 = this.upperleg2.getChild("leg2");
		this.feet2 = this.leg2.getChild("feet2");
		this.legwing2 = this.leg2.getChild("legwing2");
		this.legwing3 = this.upperleg2.getChild("legwing3");
		this.chest = this.body2.getChild("chest");
		this.upperwing1 = this.chest.getChild("upperwing1");
		this.wing1 = this.upperwing1.getChild("wing1");
		this.wingfingerbase1 = this.wing1.getChild("wingfingerbase1");
		this.wingfinger2 = this.wingfingerbase1.getChild("wingfinger2");
		this.hand1 = this.wingfingerbase1.getChild("hand1");
		this.upperwing2 = this.chest.getChild("upperwing2");
		this.wing2 = this.upperwing2.getChild("wing2");
		this.wingfingerbase2 = this.wing2.getChild("wingfingerbase2");
		this.wingfinger3 = this.wingfingerbase2.getChild("wingfinger3");
		this.hand2 = this.wingfingerbase2.getChild("hand2");
		this.neck = this.chest.getChild("neck");
		this.neck2 = this.neck.getChild("neck2");
		this.underneck1 = this.neck2.getChild("underneck1");
		this.head1 = this.neck2.getChild("head1");
		this.jaw1 = this.head1.getChild("jaw1");
		this.jaw2 = this.jaw1.getChild("jaw2");
		this.jaw3 = this.jaw2.getChild("jaw3");
		this.lowerteeth1 = this.jaw3.getChild("lowerteeth1");
		this.underhead1 = this.jaw2.getChild("underhead1");
		this.lowerteeth2 = this.jaw2.getChild("lowerteeth2");
		this.gums1 = this.jaw1.getChild("gums1");
		this.head2 = this.head1.getChild("head2");
		this.head3 = this.head2.getChild("head3");
		this.head5 = this.head3.getChild("head5");
		this.crest2 = this.head5.getChild("crest2");
		this.teeth1 = this.head3.getChild("teeth1");
		this.head4 = this.head2.getChild("head4");
		this.crest1 = this.head2.getChild("crest1");
		this.teeth2 = this.head2.getChild("teeth2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition fossil = partdefinition.addOrReplaceChild("fossil", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition root = fossil.addOrReplaceChild("root", CubeListBuilder.create(), PartPose.offset(0.0F, -24.0F, 0.0F));

		PartDefinition body2 = root.addOrReplaceChild("body2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 4.9F, -4.6F, 0.2281F, 0.0F, 0.0F));

		PartDefinition chest_r1 = body2.addOrReplaceChild("chest_r1", CubeListBuilder.create().texOffs(9, 34).addBox(-0.5F, 0.5F, -0.4F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.1F, -3.2F, -0.0524F, 0.0F, 0.0F));

		PartDefinition hips = body2.addOrReplaceChild("hips", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, 3.4F, 0.085F, -0.1308F, 0.006F));

		PartDefinition body_r1 = hips.addOrReplaceChild("body_r1", CubeListBuilder.create().texOffs(0, 23).addBox(-2.1F, -0.4F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.3516F, 2.1747F, -1.5708F, -1.5359F, 1.5708F));

		PartDefinition body_r2 = hips.addOrReplaceChild("body_r2", CubeListBuilder.create().texOffs(0, 23).addBox(-0.5F, 0.2F, -1.1F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.1F, 0.8F, -0.0349F, 0.0F, 0.0F));

		PartDefinition tail1 = hips.addOrReplaceChild("tail1", CubeListBuilder.create().texOffs(17, 16).addBox(-0.5F, 0.4848F, -0.1517F, 1.0F, 1.0F, 10.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -1.2F, 4.3F, 0.162F, 0.1274F, 0.0361F));

		PartDefinition tail2 = tail1.addOrReplaceChild("tail2", CubeListBuilder.create().texOffs(15, -2).addBox(-0.5F, -0.3F, -0.6F, 1.0F, 1.0F, 11.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.6848F, 9.9483F, 0.3068F, 0.1665F, 0.0525F));

		PartDefinition tail3 = tail2.addOrReplaceChild("tail3", CubeListBuilder.create().texOffs(30, 12).addBox(-0.5F, 0.2F, 0.3F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.5F, 9.7F, 0.0019F, 0.0873F, 0.0002F));

		PartDefinition tail4 = tail3.addOrReplaceChild("tail4", CubeListBuilder.create().texOffs(30, 0).addBox(-0.5F, 0.2F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.9F, -0.0769F, 0.087F, -0.0067F));

		PartDefinition tail5 = tail4.addOrReplaceChild("tail5", CubeListBuilder.create().texOffs(0, 32).addBox(-0.5F, 0.2F, -0.3F, 1.0F, 1.0F, 7.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 8.0F, -0.0506F, 0.0872F, -0.0044F));

		PartDefinition tailthing1 = tail5.addOrReplaceChild("tailthing1", CubeListBuilder.create().texOffs(38, 37).addBox(-0.5F, 0.2F, -0.7F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.0F, 7.0F, 0.0F, 0.3054F, 0.0F));

		PartDefinition upperleg1 = hips.addOrReplaceChild("upperleg1", CubeListBuilder.create(), PartPose.offsetAndRotation(1.7F, -0.1F, 0.5F, 0.739F, 0.1921F, -1.256F));

		PartDefinition leg1 = upperleg1.addOrReplaceChild("leg1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.9518F, 5.7108F, 0.5895F, 0.9871F, -0.158F, 0.2132F));

		PartDefinition feet1 = leg1.addOrReplaceChild("feet1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.2F, 6.9F, 0.2F, 0.5555F, -0.0365F, 0.115F));

		PartDefinition legwing12 = leg1.addOrReplaceChild("legwing12", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, -0.1367F, 0.0F, 0.0F));

		PartDefinition legwing11 = upperleg1.addOrReplaceChild("legwing11", CubeListBuilder.create(), PartPose.offset(0.4518F, 0.3108F, 1.9895F));

		PartDefinition upperleg2 = hips.addOrReplaceChild("upperleg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-1.7F, -0.1F, 0.5F, 0.3027F, -0.1921F, 1.256F));

		PartDefinition leg2 = upperleg2.addOrReplaceChild("leg2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.9518F, 5.7108F, 0.5895F, 1.6416F, 0.158F, -0.2132F));

		PartDefinition feet2 = leg2.addOrReplaceChild("feet2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.2F, 6.9F, 0.2F, 0.3809F, 0.0365F, -0.115F));

		PartDefinition legwing2 = leg2.addOrReplaceChild("legwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 1.2F, -0.1367F, 0.0F, 0.0F));

		PartDefinition legwing3 = upperleg2.addOrReplaceChild("legwing3", CubeListBuilder.create(), PartPose.offset(-0.4518F, 0.3108F, 1.9895F));

		PartDefinition chest = body2.addOrReplaceChild("chest", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.2F, -1.8F, 0.1215F, 0.0F, 0.0F));

		PartDefinition neck3_r1 = chest.addOrReplaceChild("neck3_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-1.0F, -0.9F, -2.5F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -0.9116F, -3.8401F, 1.5708F, -1.5184F, -1.5708F));

		PartDefinition neck2_r1 = chest.addOrReplaceChild("neck2_r1", CubeListBuilder.create().texOffs(0, 0).addBox(-0.5F, 0.7F, -0.4F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, -2.0F, -6.0F, 0.0524F, 0.0F, 0.0F));

		PartDefinition upperwing1 = chest.addOrReplaceChild("upperwing1", CubeListBuilder.create(), PartPose.offsetAndRotation(2.3F, -1.1F, -4.7F, 0.0611F, -0.2154F, -0.7776F));

		PartDefinition wing1 = upperwing1.addOrReplaceChild("wing1", CubeListBuilder.create(), PartPose.offsetAndRotation(5.9F, -0.6F, 0.1F, -0.598F, -0.3005F, -1.4872F));

		PartDefinition wingfingerbase1 = wing1.addOrReplaceChild("wingfingerbase1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 11.0F, -0.2F, -1.0472F, 0.0F, 0.0911F));

		PartDefinition wingfinger2 = wingfingerbase1.addOrReplaceChild("wingfinger2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.1903F, -0.2573F, -0.049F));

		PartDefinition hand1 = wingfingerbase1.addOrReplaceChild("hand1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.1F, 0.2F, -0.5F, -0.0707F, -0.766F, -1.5798F));

		PartDefinition upperwing2 = chest.addOrReplaceChild("upperwing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-2.3F, -1.1F, -4.7F, -0.0076F, 0.2236F, 0.4647F));

		PartDefinition wing2 = upperwing2.addOrReplaceChild("wing2", CubeListBuilder.create(), PartPose.offsetAndRotation(-5.9F, -0.6F, 0.1F, -0.5597F, 0.3722F, 1.6033F));

		PartDefinition wingfingerbase2 = wing2.addOrReplaceChild("wingfingerbase2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 11.0F, -0.2F, -1.0472F, 0.0F, -0.0911F));

		PartDefinition wingfinger3 = wingfingerbase2.addOrReplaceChild("wingfinger3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, 9.0F, 0.1867F, 0.1716F, 0.0322F));

		PartDefinition hand2 = wingfingerbase2.addOrReplaceChild("hand2", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.1F, 0.2F, -0.5F, -0.0707F, 0.766F, 1.5798F));

		PartDefinition neck = chest.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.5643F, -5.8905F, -0.5619F, 0.1361F, 0.0301F));

		PartDefinition cube_r1 = neck.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(16, 15).addBox(-0.5F, -0.0588F, -3.6659F, 1.0F, 1.0F, 4.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.0F, 0.2922F, 0.0808F, 0.096F, 0.0F, 0.0F));

		PartDefinition neck2 = neck.addOrReplaceChild("neck2", CubeListBuilder.create().texOffs(0, 7).addBox(-1.092F, 0.6042F, -4.3463F, 1.0F, 1.0F, 5.0F, new CubeDeformation(-0.15F)), PartPose.offsetAndRotation(0.5F, -0.0357F, -2.8095F, -0.5279F, -0.3762F, 0.0498F));

		PartDefinition underneck1 = neck2.addOrReplaceChild("underneck1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.592F, 0.8042F, 2.6537F, 0.182F, 0.0F, 0.0F));

		PartDefinition head1 = neck2.addOrReplaceChild("head1", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.592F, 0.3042F, -4.1463F, 0.8863F, -0.1583F, -0.1599F));

		PartDefinition jaw1 = head1.addOrReplaceChild("jaw1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.3604F, -0.0991F, 0.733F, 0.0F, 0.0F));

		PartDefinition jaw2 = jaw1.addOrReplaceChild("jaw2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.3723F, -3.0493F));

		PartDefinition jaw3 = jaw2.addOrReplaceChild("jaw3", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -3.8F));

		PartDefinition lowerteeth1 = jaw3.addOrReplaceChild("lowerteeth1", CubeListBuilder.create(), PartPose.offset(0.0F, -0.8F, 0.1F));

		PartDefinition underhead1 = jaw2.addOrReplaceChild("underhead1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.0F, -2.6F, -0.0911F, 0.0F, 0.0F));

		PartDefinition lowerteeth2 = jaw2.addOrReplaceChild("lowerteeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.6F, -2.7F, -0.0911F, 0.0F, 0.0F));

		PartDefinition gums1 = jaw1.addOrReplaceChild("gums1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.3723F, -1.1493F, -0.3643F, 0.0F, 0.0F));

		PartDefinition head2 = head1.addOrReplaceChild("head2", CubeListBuilder.create(), PartPose.offset(0.0F, 0.6604F, -2.4991F));

		PartDefinition head3 = head2.addOrReplaceChild("head3", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, -4.6F, 0.0456F, 0.0F, 0.0F));

		PartDefinition head5 = head3.addOrReplaceChild("head5", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.2F, 0.1F, 0.2731F, 0.0F, 0.0F));

		PartDefinition crest2 = head5.addOrReplaceChild("crest2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -0.3F, 1.2F, -0.3187F, 0.0F, 0.0F));

		PartDefinition teeth1 = head3.addOrReplaceChild("teeth1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.9F, 1.1F, -0.0456F, 0.0F, 0.0F));

		PartDefinition head4 = head2.addOrReplaceChild("head4", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, -1.1F, 0.2F, 0.3643F, 0.0F, 0.0F));

		PartDefinition crest1 = head2.addOrReplaceChild("crest1", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 0.2F, -2.2F, -0.182F, 0.0F, 0.0F));

		PartDefinition teeth2 = head2.addOrReplaceChild("teeth2", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 1.6F, -2.8F, 0.0911F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
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